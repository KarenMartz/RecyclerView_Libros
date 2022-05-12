package com.martinez.recyclerview_libros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.martinez.recyclerview_libros.adapter.BooksAdapter
import com.martinez.recyclerview_libros.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        //recuperar el recycler del activity main
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)

        binding.recyclerBooks.layoutManager = manager
        binding.recyclerBooks.adapter =
            BooksAdapter(BooksProvider.bookList){ book->
                onItemSelected(
                    book
                )
            }//it iterado, el contenido de superhero
        binding.recyclerBooks.addItemDecoration(decoration)
    }

    fun onItemSelected(Book: Book){
        Toast.makeText(this,Book.book, Toast.LENGTH_SHORT).show()
    }
}