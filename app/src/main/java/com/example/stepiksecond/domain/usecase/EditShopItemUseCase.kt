package com.example.stepiksecond.domain.usecase

import com.example.stepiksecond.domain.entity.ShopItem
import com.example.stepiksecond.domain.repository.ShopListRepository

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}