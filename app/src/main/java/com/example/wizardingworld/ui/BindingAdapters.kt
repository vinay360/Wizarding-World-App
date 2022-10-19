package com.example.wizardingworld.ui

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.wizardingworld.R
import com.example.wizardingworld.network.Characters
import com.squareup.picasso.Picasso

@BindingAdapter("characterList")
fun bindList(recyclerView: RecyclerView, characters: List<Characters>?) {
    val adapter = recyclerView.adapter as CharacterListAdapter
    adapter.submitList(characters)
}

@BindingAdapter("characterImage")
fun bindCharacterImage(imageView: ImageView, imageSrc: String) {
    if(imageSrc.isNotEmpty())
    Picasso.get().load(imageSrc).into(imageView)
    else
        imageView.setImageResource(R.drawable.ic_launcher_foreground)
}