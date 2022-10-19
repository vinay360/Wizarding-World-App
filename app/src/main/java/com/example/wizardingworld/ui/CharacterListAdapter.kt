package com.example.wizardingworld.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.wizardingworld.databinding.CharacterListItemBinding
import com.example.wizardingworld.network.Characters

class CharacterListAdapter : ListAdapter<Characters, CharacterListAdapter.CharacterViewHolder>(DiffCallBack) {

    inner class CharacterViewHolder(val binding: CharacterListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            val character = getItem(position)
            binding.character = character
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        return CharacterViewHolder(CharacterListItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(position)
    }

    companion object DiffCallBack : DiffUtil.ItemCallback<Characters>() {
        override fun areItemsTheSame(oldItem: Characters, newItem: Characters): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Characters, newItem: Characters): Boolean {
            return oldItem.name == newItem.name
        }
    }
}
