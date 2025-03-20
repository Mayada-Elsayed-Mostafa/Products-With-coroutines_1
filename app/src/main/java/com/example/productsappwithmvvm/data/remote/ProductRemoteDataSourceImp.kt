package com.example.productsappwithmvvm.data.remote

import com.example.productsappwithmvvm.data.models.Product

class ProductRemoteDataSourceImp(private val service: ProductService) : ProductRemoteDataSource {
    override suspend fun getAllProducts(): List<Product>? {
        return service.getProducts().body()?.products
    }
}