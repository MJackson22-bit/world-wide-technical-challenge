package com.upriserapp.worldwidetechnicalchallengetest.modules.categories.data

interface CategoryRepository {
    suspend fun fetchCategories(): List<String>
}