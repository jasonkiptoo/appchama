package com.example.fam_kotlin

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var database= FirebaseDatabase.getInstance().reference
        database.setValue("jason");


    ///button to registration page
        loginbtn.setOnClickListener {
            val intent= Intent (this, Register::class.java)
            startActivity(intent)
        }



            login.setOnClickListener {
                val intent = Intent(this, Home::class.java)
                startActivity(intent)

            }



        }





    }
