package kr.co.domain.usecase

import kr.co.domain.model.Store
import kr.co.domain.repository.Repository
import javax.inject.Inject

class StoreUseCase @Inject constructor(
    private val repository: Repository,
) {

    suspend operator fun invoke(): Result<List<Store>> =
        repository.store()
}