package com.example.fam_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.loginbtn
import kotlinx.android.synthetic.main.activity_main.pass
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)




        //button to go back to login screen
        loginbtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }


    }

//    private fun registusers() {
//
//        val name = editText.text.toString().trim()
//
//        if (name.isEmpty()) {
//            editText.error = "Please input Your name"
//            return
//        }
//
//
//        val ref = FirebaseDatabase.getInstance().getReference("member")
//        ref.setValue("Hello, World!");
//        val id = ref.push().key
//
//        val members = members(id, name, mobile, pass)
//
//        ref.child(id.toString()).setValue(members).addOnCompleteListener {
//
//            //Toast.makeText("members saved", Toast.LENGTH_LONG).show() }
//        }
//    }

}