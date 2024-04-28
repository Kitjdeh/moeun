package kr.co.alm.smart_photo.remote.model.request

import com.google.gson.annotations.SerializedName


// POST Request 할떄 이 방식으로 넣어라

data class LoginRequestDTO(
    @SerializedName("organizationId") val organizationId: String,
    @SerializedName("userId") val userId: String,
    @SerializedName("password") val password: String,
)