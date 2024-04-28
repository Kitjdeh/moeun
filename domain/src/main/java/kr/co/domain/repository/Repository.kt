package kr.co.domain.repository

import kr.co.domain.model.Store

interface Repository {

    suspend fun store(): Result<List<Store>>
}