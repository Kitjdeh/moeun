package kr.co.alm.smart_photo.data.repository

import kr.co.alm.smart_photo.data.source.RemoteDataSource
import kr.co.data.mapper.store.toDomain
import kr.co.domain.model.Store
import kr.co.domain.repository.Repository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class RepositoryImpl @Inject constructor(
    private val remote: RemoteDataSource,
) : Repository {
    override suspend fun store(): Result<List<Store>> {
        return remote.store().map { datalist ->
            datalist.map { it.toDomain() }
        }
    }


}

