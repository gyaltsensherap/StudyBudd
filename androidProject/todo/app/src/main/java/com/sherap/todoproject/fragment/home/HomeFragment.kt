package com.sherap.todoproject.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.sherap.todoproject.R

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val textView = view.findViewById<TextView>(R.id.tv_title)
        val btnNext = view.findViewById<Button>(R.id.btn_next)
        btnNext.setOnClickListener {
            findNavController().navigate(R.id.secondFragment)
        }
        return view
    }
}
