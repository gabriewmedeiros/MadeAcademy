package com.example.firstexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_linear_layout.*

class LinearLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)

        Toast.makeText(applicationContext, "ViewGroup: LinearLayout", Toast.LENGTH_LONG).show()

        btFinish2.setOnClickListener {

            val intent = Intent(applicationContext, RelativeLayoutActivity:: class.java)
            startActivity(intent)
        }
    }
}