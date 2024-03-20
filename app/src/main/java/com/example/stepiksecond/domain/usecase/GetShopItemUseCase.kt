package com.example.stepiksecond.domain.usecase

import com.example.stepiksecond.domain.entity.ShopItem
import com.example.stepiksecond.domain.repository.ShopListRepository

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}