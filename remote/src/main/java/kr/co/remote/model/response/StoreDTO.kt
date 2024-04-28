package kr.co.alm.smart_photo.remote.model.response

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


data class StoreDTO(
    @SerializedName("id") val id: Int = 0,
    @SerializedName("storeName") val storeName: String = "",
    @SerializedName("hourFee") val hourFee: Int = 0
)