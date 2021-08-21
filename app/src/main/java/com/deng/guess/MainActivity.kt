package com.deng.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv = findViewById<TextView>(R.id.tv)
        tv.text="Hello Kotlin!"
        val btn = findViewById<Button>(R.id.btn)

        //匿名類別+lambda
        btn.setOnClickListener {
            tv.text = "what?"
        }

        val reset = findViewById<Button>(R.id.reset)
        reset.setOnClickListener {
            tv.text = "Hello Kotlin!"
            btn.isEnabled = false
        }

    }
}