package kr.co.alm.smart_photo.remote.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kr.co.alm.smart_photo.data.source.RemoteDataSource
import kr.co.alm.smart_photo.remote.source.RemoteDataSourceImpl

@Module
@InstallIn(SingletonComponent::class)
internal abstract class RemoteDataSourceModule {

    @Binds
    abstract fun bindAuthenticationRemoteDataSource(
        source: RemoteDataSourceImpl,
    ): RemoteDataSource
}