package com.upriserapp.worldwidetechnicalchallengetest.modules.categories.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.upriserapp.worldwidetechnicalchallengetest.modules.categories.data.CategoryRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CategoryViewModel @Inject constructor(
    private val categoryRepository: CategoryRepository
) : ViewModel() {

    private val _categories: MutableLiveData<List<String>> = MutableLiveData()
    val categories get() = _categories

    fun fetchCategories() {
        viewModelScope.launch {
            val response = categoryRepository.fetchCategories()
            _categories.postValue(response)
        }
    }
}