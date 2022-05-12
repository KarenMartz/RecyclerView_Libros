package com.martinez.recyclerview_libros.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.martinez.recyclerview_libros.Book
import com.martinez.recyclerview_libros.R

class BooksAdapter (private val bookList:List<Book>, private val onClickListener:(Book)->Unit ) : RecyclerView.Adapter<BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        //devolver al viewholder lo que se va a presentar, el item , el layout
        val layoutInflater = LayoutInflater.from(parent.context)
        return BooksViewHolder(layoutInflater.inflate(R.layout.item_book,parent,false))
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        //va a pasar por cada item y llama al superhero render
        val item = bookList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = bookList.size
    //devolviendo un entero, devuelve el tama;o del listado

}