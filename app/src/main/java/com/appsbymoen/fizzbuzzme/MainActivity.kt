package com.appsbymoen.fizzbuzzme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 0..100) {

        when {
            i<50 -> Log.i(i.toString(),"fizz")
            i>75 -> Log.i(i.toString(),"buzz")
            else -> Log.i(i.toString(),"fizz buzz")
        }
        }

    }
}