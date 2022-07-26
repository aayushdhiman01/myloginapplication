package com.aayush.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class otp_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)
        var email: String=" "
        lateinit  var tvEmail: TextView
        intent?.let { abc->
            if (abc.hasExtra("email"))
                email=abc.getStringExtra("email") as String
        }?:kotlin.run{ }
        tvEmail=findViewById(R.id.tvEmail)
        tvEmail.setText(email)
    }
}