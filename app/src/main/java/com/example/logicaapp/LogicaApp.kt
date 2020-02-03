package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.logica_app.*

class LogicaApp : AppCompatActivity() {
    private val valueTrue = "T"
    private val valueFalse = "F"
    private var correctAnswers = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logica_app)

        submitBtn.setOnClickListener {
            checkUserInput()
        }
    }

    private fun countCorrectAnswers() {
        if (textInputRow1.text.toString() == valueTrue) {
            correctAnswers += 1
        }
        if (textInputRow2.text.toString() == valueFalse) {
            correctAnswers += 1
        }
        if (textInputRow3.text.toString() == valueFalse) {
            correctAnswers += 1
        }
        if (textInputRow4.text.toString() == valueFalse) {
            correctAnswers += 1
        }
    }


    private fun checkUserInput() {
        countCorrectAnswers()

        Toast.makeText(this, getString(R.string.answersFeedback, correctAnswers), Toast.LENGTH_LONG)
            .show()

        correctAnswers = 0
    }
}
