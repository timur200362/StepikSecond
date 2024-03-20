package com.example.stepiksecond.domain.usecase

import androidx.lifecycle.LiveData
import com.example.stepiksecond.domain.entity.ShopItem
import com.example.stepiksecond.domain.repository.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): LiveData<List<ShopItem>> {
        return shopListRepository.getShopList()
    }
}