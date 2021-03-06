package com.thorin.mvvmshoppinglist.data.repositories

import com.thorin.mvvmshoppinglist.data.db.ShoppingDatabase
import com.thorin.mvvmshoppinglist.data.db.entities.ShoppingItem

class ShoppingRepository(private val db: ShoppingDatabase) {

    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItem() = db.getShoppingDao().getAllShoppingItem()

}