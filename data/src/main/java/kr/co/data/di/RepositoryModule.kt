package kr.co.alm.smart_photo.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kr.co.alm.smart_photo.data.repository.RepositoryImpl
import kr.co.domain.repository.Repository

@Module
@InstallIn(SingletonComponent::class)
internal abstract class RepositoryModule {

    @Binds
    abstract fun bindAuthRepository(
        repository: RepositoryImpl,
    ): Repository
}