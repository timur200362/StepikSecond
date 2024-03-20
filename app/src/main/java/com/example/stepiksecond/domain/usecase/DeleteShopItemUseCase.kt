package com.example.stepiksecond.domain.usecase

import com.example.stepiksecond.domain.entity.ShopItem
import com.example.stepiksecond.domain.repository.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}