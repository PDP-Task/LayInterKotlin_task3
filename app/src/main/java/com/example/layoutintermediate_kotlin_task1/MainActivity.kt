package com.example.layoutintermediate_kotlin_task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.layoutintermediate_kotlin_task1.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var bin: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bin = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bin.root)
        
        val id = bin.editId.text.toString()
        val password = bin.editPassword.text.toString()
        bin.btnLogin.setOnClickListener {
            Toast.makeText(applicationContext, "$id, $password", Toast.LENGTH_SHORT).show()
        }
    }
}