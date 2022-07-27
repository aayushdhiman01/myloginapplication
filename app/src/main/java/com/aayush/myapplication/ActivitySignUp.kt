package com.aayush.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.widget.doOnTextChanged

class ActivitySignUp : AppCompatActivity() {
    lateinit var etEmail: EditText
    lateinit var tvSignup: TextView
    lateinit var etpassword: EditText
    lateinit var etpassword_S2: EditText
    lateinit var etPhonenumber: EditText

    lateinit var rgGender: RadioGroup
    lateinit var rbHe: RadioButton
    lateinit var rbShe: RadioButton
    lateinit var rbOther: RadioButton
    lateinit var etOtherSpecify: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        tvSignup = findViewById(R.id.tvSignup)
        etEmail = findViewById(R.id.etEmail_S)
        etpassword = findViewById(R.id.etpassword_S)
        etpassword_S2 = findViewById(R.id.etpassword_S2)
        etPhonenumber = findViewById(R.id.etPhonenumber_S)
        rgGender = findViewById(R.id.rgGender)
        rbHe = findViewById(R.id.rbMale)
        rbShe = findViewById(R.id.rbFemale)
        rbOther = findViewById(R.id.rbOther)
        etOtherSpecify = findViewById(R.id.etOtherSpecify)

        etpassword.doOnTextChanged { text, _, _, _ ->
            if ((text?.length ?: 0) < 6 || (text?.length ?: 0) > 10) {
                etpassword.error =
                    resources.getString(R.string.password_length_should_be_between_6_and_10)
            } else {
                etpassword.error = null
            }
        }
        etpassword_S2.doOnTextChanged { text,_,_, _ ->

        }
        tvSignup.setOnClickListener {
            Toast.makeText(this, "SignUp Successful", Toast.LENGTH_LONG)
                .show()
        }
        rgGender.setOnCheckedChangeListener { radioGroup, id ->
            when (id) {
                R.id.rbOther -> {
                    etOtherSpecify.visibility = View.VISIBLE
                }
                else -> {
                    etOtherSpecify.visibility = View.INVISIBLE
                }
            }
        }
    }
}
