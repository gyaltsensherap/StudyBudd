package com.sherap.restapidemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CoroutineScope(Main).launch {
            simulateBlockingOperation()
        }
    }

    suspend fun simulateBlockingOperation() {
        var i = 0
        while (i < 10) {
            delay(1000)
            Log.d("Kunsang", " sleep $i")
            i++
        }
    }
}
