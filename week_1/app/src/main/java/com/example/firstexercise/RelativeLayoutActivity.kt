package com.example.firstexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_relative_layout.*

class RelativeLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)

        Toast.makeText(applicationContext, "ViewGroup: RelativeLayout", Toast.LENGTH_SHORT).show()

        btFinish3.setOnClickListener {

            Toast.makeText(applicationContext, "Você visualizou todos os ViewGroups! Feche e abra o app novamente para repetir o fluxo!",
                Toast.LENGTH_LONG).show()

        }

    }
}