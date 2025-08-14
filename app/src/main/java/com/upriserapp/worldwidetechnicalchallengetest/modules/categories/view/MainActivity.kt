package com.upriserapp.worldwidetechnicalchallengetest.modules.categories.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.upriserapp.worldwidetechnicalchallengetest.databinding.ActivityMainBinding
import com.upriserapp.worldwidetechnicalchallengetest.modules.categories.view.adapter.CategoryAdapter
import com.upriserapp.worldwidetechnicalchallengetest.modules.categories.viewmodel.CategoryViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    private val categoryViewModel: CategoryViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding?.root)
        setObservers()
        fetchCategories()
    }

    private fun fetchCategories() {
        categoryViewModel.fetchCategories()
    }

    private fun setObservers() {
        categoryViewModel.categories.observe(this) { categories ->
            setCategories(categories)
        }
    }

    private fun setCategories(categories: List<String>) {
        val adapter = CategoryAdapter(categories)
        binding.categoryList.adapter = adapter
    }
}
