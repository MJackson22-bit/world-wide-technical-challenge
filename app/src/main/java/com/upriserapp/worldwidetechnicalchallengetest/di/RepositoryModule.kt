package com.upriserapp.worldwidetechnicalchallengetest.di

import com.upriserapp.worldwidetechnicalchallengetest.modules.categories.data.CategoryRepository
import com.upriserapp.worldwidetechnicalchallengetest.modules.categories.data.CategoryRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindRepositoryCategory(categoryRepositoryImpl: CategoryRepositoryImpl): CategoryRepository
}