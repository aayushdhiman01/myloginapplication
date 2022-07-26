package com.aayush.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class forgot_password_activity : AppCompatActivity() {
    lateinit var etEmail:EditText
    lateinit var btnForgetPassword:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgotpassword)
        etEmail=findViewById(R.id.etEmail)
        btnForgetPassword=findViewById(R.id.tvForgot)

        btnForgetPassword.setOnClickListener {
            if(etEmail.text.toString().isNullOrEmpty()){
                etEmail.error=resources.getString(R.string.please_enter_name)
                etEmail.requestFocus()
            }
            else{
                var intent=Intent(this,otp_activity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}