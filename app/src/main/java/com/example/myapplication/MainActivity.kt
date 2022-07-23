package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    lateinit var etEmail: EditText
    lateinit var etpassword: EditText
    lateinit var etPhonenumber: EditText
    lateinit var tvForgot: TextView
    lateinit var btnlogin: Button
    lateinit var imgFire:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etEmail=findViewById(R.id.etEmail)
        etpassword=findViewById(R.id.etpassword)
        etPhonenumber=findViewById(R.id.etPhonenumber)
        tvForgot=findViewById(R.id.tvForgot)
        btnlogin=findViewById(R.id.btnlogin)
        imgFire=findViewById(R.id.imgFire)

        imgFire.setOnClickListener {
            System.out.println("Image Clicked")
        }
        btnlogin.setOnClickListener {
            System.out.println("Login Clicked")
            var email=etEmail.text.toString()
            var password=etpassword.text.toString()
            if(email.isNullOrEmpty()){
                etEmail.error=resources.getString(R.string.please_enter_name)
                etEmail.requestFocus()
            }
            else if(password.isNullOrEmpty()){
                etpassword.error=resources.getString(R.string.please_enter_password)
                etpassword.requestFocus()
            }
            else{
                Toast.makeText(this,resources.getString(R.string.login_succesfull),Toast.LENGTH_LONG).show()
            }
        }
        tvForgot.setOnClickListener {
            Toast.makeText(this,resources.getString(R.string.feature_comingsoon),Toast.LENGTH_SHORT).show()
        }
        
    }


}