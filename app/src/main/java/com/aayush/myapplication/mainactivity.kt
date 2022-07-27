package com.aayush.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged

class mainactivity : AppCompatActivity() {
    lateinit var etEmail: EditText
    lateinit var tvSignup:TextView
    lateinit var etpassword: EditText
    lateinit var etPhonenumber: EditText
    lateinit var tvForgot: TextView
    lateinit var btnlogin: Button
    lateinit var imgFire:ImageView
    lateinit var rgGender:RadioGroup
    lateinit var rbHe:RadioButton
    lateinit var rbShe:RadioButton
    lateinit var rbOther:RadioButton
    lateinit var etOtherSpecify:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvSignup=findViewById(R.id.tvSignup)
        etEmail=findViewById(R.id.etEmail)
        etpassword=findViewById(R.id.etpassword)
        etPhonenumber=findViewById(R.id.etPhonenumber)

        tvForgot=findViewById(R.id.tvForgot)
        btnlogin=findViewById(R.id.btnlogin)
        imgFire=findViewById(R.id.imgFire)
        rgGender=findViewById(R.id.rgGender)
        rbHe=findViewById(R.id.rbMale)
        rbShe=findViewById(R.id.rbFemale)
        rbOther=findViewById(R.id.rbOther)
        etOtherSpecify=findViewById(R.id.etOtherSpecify)

        imgFire.setOnClickListener {
            System.out.println("Image Clicked")
        }


        etpassword.doOnTextChanged { text,_,_,_->
            if ((text?.length ?:0)<6 || (text?.length ?:0)>10){
                etpassword.error=resources.getString(R.string.password_length_should_be_between_6_and_10)
        }
            else{
                etpassword.error =null
            }
        }
        btnlogin.setOnClickListener {
            System.out.println("Login Clicked")
            var email=etEmail.text.toString()
            var password=etpassword.text.toString()
            if(email.isNullOrEmpty()){
                etEmail.error=resources.getString(R.string.please_enter_name)
                etEmail.requestFocus()
            }
            else if(!email.equals("aayushdhiman@gmail.com")){
                etEmail.error=resources.getString(R.string.please_enter_name)
                etEmail.requestFocus()
            }
            else if(!password.equals("1234560")){
                etpassword.error=resources.getString(R.string.please_enter_password)
                etpassword.requestFocus()
            }
            else if(password.isNullOrEmpty()){
                etpassword.error=resources.getString(R.string.please_enter_password)
                etpassword.requestFocus()
            }
            else if(password.length<6 || password.length>10 ){
                etpassword.error=resources.getString(R.string.password_length_should_be_between_6_and_10)
                etpassword.requestFocus()
            }
            else if(android.util.Patterns.EMAIL_ADDRESS.matcher(etEmail.text.toString()).matches() == false){
                etEmail.error=resources.getString(R.string.please_enter_name)
                etEmail.requestFocus()
            }
            else{
                Toast.makeText(this,resources.getString(R.string.login_succesfull),Toast.LENGTH_LONG).show()
                var intent= Intent(this, login_activity::class.java)
                startActivity(intent)
                finish()
            }
        }

        tvForgot.setOnClickListener {
            var intent= Intent(this,forgot_password_activity::class.java)
            startActivity(intent)
            finish()
        }
        tvSignup.setOnClickListener {
            var intent= Intent(this,ActivitySignUp::class.java)
            startActivity(intent)
            finish()
        }
        rgGender.setOnCheckedChangeListener { radioGroup, id ->
            when(id){
                R.id.rbOther->{
                    etOtherSpecify.visibility=View.VISIBLE
                }
                else->{
                    etOtherSpecify.visibility=View.INVISIBLE
                }
            }
        }
    }


}