package com.martinez.recyclerview_libros.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.martinez.recyclerview_libros.Book
import com.martinez.recyclerview_libros.databinding.ItemBookBinding

class BooksViewHolder(view: View): RecyclerView.ViewHolder(view) {
    //generar las variables para acceder a ellas
    val binding = ItemBookBinding.bind(view)


    fun render (bookModel: Book, onClickListener:(Book)->Unit){
        //se llamara por cada item del listado de superheroe
        binding.tvBookName.text= bookModel.book
        binding.tvAuthor.text = bookModel.author
        binding.tvEditorial.text = bookModel.editorial
        Glide.with(binding.ivBook.context).load(bookModel.photo).into(binding.ivBook)
        itemView.setOnClickListener{onClickListener(bookModel)}
    }

}