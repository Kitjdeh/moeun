package kr.co.alm.smart_photo.remote.source


import kr.co.alm.smart_photo.data.model.StoreData
import kr.co.alm.smart_photo.data.source.RemoteDataSource
import kr.co.remote.retrofit.service.ApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class RemoteDataSourceImpl @Inject constructor(
    private val apiService: ApiService,
) : RemoteDataSource {

    override suspend fun store(): Result<List<StoreData>> = runCatching {
        val response = apiService.store()
        if (response.code() != 200) throw Exception()
         response.body()!!.map { it ->
            StoreData(
                id = it.id,
                storeName = it.storeName,
                hourFee = it.hourFee,
            )
        }
    }
    // 단일 객체로 만들 경우 이렇게
//    override suspend fun store(): Result<StoreData> = runCatching {
//        val response = apiService.store()
//        println("RemoteDataSourceImpl 도착")
//        if (response.code() != 200) throw Exception()
//        return@runCatching StoreData(
//            id = response.body()!!.id,
//            storeName = response.body()!!.storeName,
//            hourFee = response.body()!!.hourFee,
//        )
//    }


//    override suspend fun login(
//        loginAccountData: LoginAccountData,
//    ): Result<Unit> = runCatching {
//        val response = webScheduleService.login(
//            LoginRequestDTO(
//                organizationId = loginAccountData.organizationId,
//                userId = loginAccountData.userId,
//                password = loginAccountData.password
//            )
//        ).getOrThrow()
//        apiTokenHolder.token = response.token
//    }
}