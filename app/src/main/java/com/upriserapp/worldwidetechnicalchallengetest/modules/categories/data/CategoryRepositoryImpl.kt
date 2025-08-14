package com.upriserapp.worldwidetechnicalchallengetest.modules.categories.data

import com.upriserapp.worldwidetechnicalchallengetest.core.datasource.CategoryApi
import javax.inject.Inject

class CategoryRepositoryImpl @Inject constructor(
    private val categoryApi: CategoryApi
) : CategoryRepository {
    override suspend fun fetchCategories(): List<String> {
        val response = categoryApi.fetchCategories()

        return response.body().orEmpty()
    }
}