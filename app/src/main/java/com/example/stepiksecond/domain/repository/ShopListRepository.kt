package com.example.stepiksecond.domain.repository

import com.example.stepiksecond.domain.entity.ShopItem

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun editShopItem(shopItem: ShopItem)

    fun getShopList(): List<ShopItem>
}