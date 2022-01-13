package com.example.myapplication.test.myfixapplicationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et = findViewById<EditText>(R.id.editText)
        val et2 = findViewById<EditText>(R.id.editText2)
        val bt = findViewById<Button>(R.id.button)
        val pattern="(\\w+)".toRegex()
        val pattern2="\\d".toRegex()

        bt.setOnClickListener {
            if(pattern.matches(et.text) && pattern2.matches(et2.text)){
                Toast(this).showCustomToast("${et.text} and ${et2.text} is received", this)
            }
            //Toast.makeText(this, "mahdi is here", Toast.LENGTH_SHORT).show()

        }
    }
}