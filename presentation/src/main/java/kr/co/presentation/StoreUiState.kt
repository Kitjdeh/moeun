package kr.co.presentation

data class StoreUiState(
    val id: Int,
    val storeName: String,
    val hourFee: Int
) {

    val idString: String
        get() = id.toString()
}