package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var e1: EditText? = null
    var e2: EditText? = null
    var t1: TextView? = null
    var num1 = 0
    var num2 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val numbers: Boolean
        get() {
            e1 = findViewById<View>(R.id.num1) as EditText
            e2 = findViewById<View>(R.id.num2) as EditText
            t1 = findViewById<View>(R.id.result) as TextView
            val s1 = e1!!.text.toString()
            val s2 = e2!!.text.toString()
            if (s1 == null && s2 == null
                    || s1 == "" && s2 == "") {
                val result = "Please enter a value"
                t1!!.text = result
                return false
            } else {
                num1 = e1!!.text.toString().toInt()
                num2 = e2!!.text.toString().toInt()
            }
            return true
        }

    fun doSum(v: View?) {
        if (numbers) {
            val sum = num1 + num2
            t1!!.text = Integer.toString(sum)
        }
    }

    fun doPow(v: View?) {
        if (numbers) {
            val sum = Math.pow(num1.toDouble(), num2.toDouble())
            t1!!.text = java.lang.Double.toString(sum)
        }
    }

    fun doSub(v: View?) {
        if (numbers) {
            val sum = num1 - num2
            t1!!.text = Integer.toString(sum)
        }
    }

    fun doMul(v: View?) {
        if (numbers) {
            val sum = num1 * num2
            t1!!.text = Integer.toString(sum)
        }
    }

    fun doDiv(v: View?) {
        if (numbers) {
            val sum = num1 / (num2 * 1.0)
            t1!!.text = java.lang.Double.toString(sum)
        }
    }

    fun doMod(v: View?) {
        if (numbers) {
            val sum = num1 % num2.toDouble()
            t1!!.text = java.lang.Double.toString(sum)
        }
    }
}