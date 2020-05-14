package com.example.nummixmax

/***
 * Powered by: VMDB
 ***/

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var editNum1: EditText? = null
    private var editNum2: EditText? = null
    private var editNum3: EditText? = null
    private var txtResult: TextView? = null
    private var evaluar: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializationViews()
        evaluar!!.setOnClickListener{
            evaluate()
            //clearEditTexts()
        }
    }

    private fun clearEditTexts(){
        editNum1?.setText("")
        editNum2?.setText("")
        editNum3?.setText("")
        txtResult?.setText("")
    }

    private fun initializationViews(){
        editNum1=findViewById<View>(R.id.editText1)as EditText
        editNum2=findViewById<View>(R.id.editText2)as EditText
        editNum3=findViewById<View>(R.id.editText3)as EditText
        txtResult = findViewById<View>(R.id.textView2)as TextView
        evaluar=findViewById<View>(R.id.button)as Button
    }

    private fun evaluate() {
        var num1 = editNum1?.text.toString()
        var num2 = editNum2?.text.toString()
        var num3 = editNum2?.text.toString()

        val min = if (num1 < num2 && num1 < num3) num1 else if (num2 < num3) num2 else num3
        val max = if (num1 >num2 && num1 > num3) num1 else if (num2 > num3) num2 else num3

        txtResult?.setText("El mayor de la lista es $max y el menor es $min")
    }
}
