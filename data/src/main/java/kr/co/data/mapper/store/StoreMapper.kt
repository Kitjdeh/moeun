package kr.co.data.mapper.store

import kr.co.alm.smart_photo.data.model.StoreData
import kr.co.domain.model.Store


internal fun StoreData.toDomain() = Store(
    id = id,
    storeName = storeName,
    hourFee = hourFee
)

internal fun Store.toData() = StoreData(
    id = id,
    storeName = storeName,
    hourFee = hourFee
)