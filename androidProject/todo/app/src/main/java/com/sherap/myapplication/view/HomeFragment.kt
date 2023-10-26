package com.sherap.myapplication.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.sherap.myapplication.R
import com.sherap.myapplication.adapter.TodoAdapter
import com.sherap.myapplication.model.Todo

class Homeragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val rvTodo = view.findViewById<RecyclerView>(R.id.rv_todo)
        val todoList = fetchList()
        val todoAdapter = TodoAdapter(todoList)
        rvTodo.adapter = todoAdapter
        val btnAdd = view.findViewById<Button>(R.id.btn_add)
        btnAdd.setOnClickListener {
            findNavController().navigate(R.id.addFragment)
        }
        return view
    }

    private fun fetchList(): List<Todo> {
        val todo1 = Todo(1, "Todo1", "Description 1")
        val todo2 = Todo(2, "Todo2", "Description 1")
        val todo3 = Todo(3, "Todo3", "Description 1")
        val todo4 = Todo(4, "Todo4", "Description 1")
        return listOf(todo1, todo2, todo3, todo4)
    }
}
