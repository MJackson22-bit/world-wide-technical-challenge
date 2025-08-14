package com.upriserapp.worldwidetechnicalchallengetest.modules.categories.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.upriserapp.worldwidetechnicalchallengetest.R
import com.upriserapp.worldwidetechnicalchallengetest.databinding.ItemCategoryBinding

class CategoryAdapter(private val categories: List<String>) :
    RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(categories[position])
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    inner class CategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val  binding = ItemCategoryBinding.bind(view)
        fun bind(category: String) {
            binding.categoryName.text = category
        }
    }
}