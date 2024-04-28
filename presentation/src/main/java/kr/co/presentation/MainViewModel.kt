package kr.co.presentation

import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kr.co.domain.usecase.StoreUseCase
import kr.co.presentation.base.BaseViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val storeUseCase: StoreUseCase
) : BaseViewModel<Unit>() {

    private val _uiStateFlow = MutableStateFlow(
        StoreUiState(
            id = 0,
            storeName = "",
            hourFee = 0
        )
    )
    val uiStateFlow = _uiStateFlow.asStateFlow()

    fun click() {
        viewModelScope.launch {
            val response = storeUseCase.invoke()
            if (response.isSuccess) {
                val data = response.getOrThrow().first()
                _uiStateFlow.update { uiState ->
                    uiState.copy(
                        id = data.id,
                        storeName = data.storeName,
                        hourFee = data.hourFee
                    )
                }
            }
        }
    }

}