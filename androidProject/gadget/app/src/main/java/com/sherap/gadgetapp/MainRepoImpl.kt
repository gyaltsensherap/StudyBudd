package com.sherap.gadgetapp

import com.sherap.gadgetapp.apiservice.ApiService
import com.sherap.gadgetapp.model.post.Posts
import com.sherap.gadgetapp.model.product.Products
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainRepo {
    val retrofit =
        Retrofit.Builder().baseUrl("https://dummyjson.com/") // Replace with your API base URL
            .addConverterFactory(GsonConverterFactory.create()).build()

    // Create an instance of the ApiService
    val apiService = retrofit.create(ApiService::class.java)

    suspend fun getProducts(): List<Products> {
        return apiService.getProducts().products
    }

    suspend fun getPosts(): List<Posts> {
        return apiService.getPosts().posts
    }
}
