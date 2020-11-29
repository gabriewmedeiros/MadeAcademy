package com.example.firstexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "ViewGroup: ConstraintLayout", Toast.LENGTH_LONG).show()

        btFinish.setOnClickListener {

            val intent = Intent(applicationContext, LinearLayoutActivity:: class.java)
            startActivity(intent)
        }
    }
}