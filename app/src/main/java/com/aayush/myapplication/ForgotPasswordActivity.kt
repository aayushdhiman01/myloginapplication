package com.aayush.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class ForgotPasswordActivity : AppCompatActivity() {
    lateinit var etEmail:EditText
    lateinit var btnForgetPassword:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        etEmail=findViewById(R.id.etEmail)
        btnForgetPassword=findViewById(R.id.tvForgot)

        btnForgetPassword.setOnClickListener {  }
    }
}