package com.sherap.mvvvmapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.sherap.mvvvmapp.databinding.ActivityFirstBinding
import com.sherap.mvvvmapp.event.EventObserver
import com.sherap.mvvvmapp.second.SecondActivty

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()

    // val viewModel = MainViewModel() dont use
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityFirstBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_first,
        )
        binding.mainViewModel = viewModel
        viewModel.validUserToast.observe(
            this,
            EventObserver {
                Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
                val intent = Intent(this, SecondActivty::class.java)
                startActivity(intent)
            },
        )
        viewModel.errorLiveData.observe(
            this,
            EventObserver {
                Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
            },
        )
    }
}
