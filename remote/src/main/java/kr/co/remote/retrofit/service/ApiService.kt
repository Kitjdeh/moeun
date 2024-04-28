package kr.co.remote.retrofit.service

import kr.co.alm.smart_photo.remote.model.response.StoreDTO
import retrofit2.Response
import retrofit2.http.GET


interface ApiService {
    //    @GET("stores")
//    suspend fun store(
//    ): Response<StoreDTO>
    @GET("stores")
    suspend fun store(
    ): Response<List<StoreDTO>>
}