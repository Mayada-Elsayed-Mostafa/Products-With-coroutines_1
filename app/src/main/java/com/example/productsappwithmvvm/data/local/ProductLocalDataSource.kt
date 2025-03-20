package com.example.productsappwithmvvm.data.local

import com.example.productsappwithmvvm.data.models.Product

interface ProductLocalDataSource {

    suspend fun getFavProducts(): List<Product>

    suspend fun insertProduct(product: Product): Long

    suspend fun deleteProduct(product: Product?): Int
}