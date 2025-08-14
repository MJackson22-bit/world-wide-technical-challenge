package com.upriserapp.worldwidetechnicalchallengetest.core.datasource

import retrofit2.Response
import retrofit2.http.GET

interface CategoryApi {
    @GET("categories")
    suspend fun fetchCategories(): Response<List<String>?>
}