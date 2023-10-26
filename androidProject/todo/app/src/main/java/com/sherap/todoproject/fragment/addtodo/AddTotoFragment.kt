package com.sherap.todoproject.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.sherap.todoproject.R

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val editText = view.findViewById<EditText>(R.id.et_title)
        val btnSave = view.findViewById<Button>(R.id.btn_save)
        btnSave.setOnClickListener {
            findNavController().navigate(R.id.firstFragment)
        }
        return view
    }
}
