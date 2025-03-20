package com.example.productsappwithmvvm.data.remote

import com.example.productsappwithmvvm.data.models.Product

interface ProductRemoteDataSource {

    suspend fun getAllProducts(): List<Product>?
}