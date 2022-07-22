package com.aayush.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        System.out.println("on start called")
    }

    override fun onResume() {
        super.onResume()
        System.out.println("On resume called")
    }

    override fun onPause() {
        super.onPause()
        System.out.println("On pause called")
    }

    override fun onRestart() {
        super.onRestart()
        System.out.println("On restart called")
    }

    override fun onStop() {
        super.onStop()
        System.out.println("On stop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        System.out.println("On destroy called")
    }
}