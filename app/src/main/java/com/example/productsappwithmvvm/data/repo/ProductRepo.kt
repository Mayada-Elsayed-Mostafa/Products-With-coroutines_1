package com.example.productsappwithmvvm.data.repo

import com.example.productsappwithmvvm.data.models.Product

interface ProductRepo {

    suspend fun getAllProducts(isOnline: Boolean): List<Product>?

    suspend fun addProduct(product: Product): Long

    suspend fun removeProduct(product: Product): Int
}