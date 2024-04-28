package kr.co.alm.smart_photo.data.source

import kr.co.alm.smart_photo.data.model.StoreData

interface RemoteDataSource {

    suspend fun store(): Result<List<StoreData>>
}