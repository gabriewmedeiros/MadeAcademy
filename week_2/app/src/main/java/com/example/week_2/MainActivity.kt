package com.example.week_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextWatcher = object : TextWatcher {

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {

                val enable = edtValue1.text.toString().isNotEmpty()
                        && edtValue2.text.toString().isNotEmpty()

                btAdd.isEnabled = enable
                btSubtract.isEnabled = enable
                btMultiply.isEnabled = enable
                btDivide.isEnabled = enable
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun afterTextChanged(s: Editable) {}
        }


        edtValue1.addTextChangedListener(myTextWatcher)

        edtValue2.addTextChangedListener(myTextWatcher)


        btAdd.setOnClickListener {

            //Retrieves tuped values
            val value1 = edtValue1.text.toString()
            val value2 = edtValue1.text.toString()

            //Send results to the next activity
            showResult(value1, value2)

            clearResult()
        }

        btSubtract.setOnClickListener {

            //Retrieves typed values
            val value1 = edtValue1.text.toString()
            val value2 = edtValue2.text.toString()

            //Sends result to the next activity
            showResult(value1, value2)

            clearResult()
        }

        btMultiply.setOnClickListener {

            //Retrieves typed values
            val value1 = edtValue1.text.toString()
            val value2 = edtValue2.text.toString()

            //Sends result to the next activity
            showResult(value1, value2)

            clearResult()
        }

        btDivide.setOnClickListener {

            //Retrieves typed values
            val value1 = edtValue1.text.toString()
            val value2 = edtValue2.text.toString()

            if (value2 == "0"){
                Toast.makeText(applicationContext, "Não é possível realizar uma divisão por 0", Toast.LENGTH_SHORT).show()
            } else {
                showResult(value1, value2)
            }

            clearResult()
        }
    }

    private fun add(value1: String, value2: String): Int {

        //Convert string values to numbers
        val num1 = value1.toInt()
        val num2 = value2.toInt()

        //Calculate the sum
        return num1 + num2
    }

    private fun subtract(value1: String, value2: String): Int {

        //Convert string values to numbers
        val num1 = value1.toInt()
        val num2 = value2.toInt()

        //Calculate the subtraction
        return num1 - num2
    }

    private fun multiply(value1: String, value2: String): Int {

        //Convert string values to numbers
        val num1 = value1.toInt()
        val num2 = value2.toInt()

        //Calculate the multiplication
        return num1 * num2
    }

    private fun divide(value1: String, value2: String): Int {

        //Convert string values to numbers
        val num1 = value1.toInt()
        val num2 = value2.toInt()

        //Calculate the division
        return num1 / num2
    }

    private fun clearResult() {

        //Erase typed values
        edtValue1.text = null
        edtValue2.text = null
    }

    private fun showResult(value1: String, value2: String) {

        val intent = Intent(applicationContext, ResultActivity::class.java)

        //Send results to the next activity
        val result = add(value1, value2).toString()
        subtract(value1, value2).toString()
        multiply(value1, value2).toString()
        divide(value1, value2).toString()

        intent.putExtra("result", result)
        startActivity(intent)
    }
}





