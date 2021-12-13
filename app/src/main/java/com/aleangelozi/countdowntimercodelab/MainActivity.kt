package com.aleangelozi.countdowntimercodelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mTextField = findViewById<TextView>(R.id.mTextField)

        object : CountDownTimer(60000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                mTextField.setText("seconds remaining: " + millisUntilFinished / 1000)
            }

            override fun onFinish() {
                mTextField.setText("done!")
            }
        }.start()
    }
}