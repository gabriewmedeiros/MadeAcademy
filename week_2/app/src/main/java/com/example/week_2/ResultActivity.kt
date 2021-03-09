package com.example.week_2

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        intent.extras.let { data ->

            data.let { result ->

                txtResult.text = result?.getString("result", "")

                btBack.setOnClickListener {
                     val intent = Intent()
                    intent.putExtra("result", txtResult.text.toString())
//                    setResult(0, intent)

                    finish()
                }
            }
        }
    }
}