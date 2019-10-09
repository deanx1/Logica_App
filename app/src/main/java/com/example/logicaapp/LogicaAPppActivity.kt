package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_logica_app.*

class LogicaAPppActivity : AppCompatActivity() {

    private var currentThrow: String = "ff"
    private var lastThrow: String = "T"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logica_app)
        initViews()
    }

    /**
     * Set the initial (UI) state of the game.
     */
    private fun initViews() {
        btn_confirm.setOnClickListener {
            if (isCorrect()) {
                onAnswerCorrect()
            } else {
                onAnswerIncorrect()
            }
        }
    }

    private fun isCorrect(): Boolean {
        val answer_tt = et_r2_3.text.toString()
        val answer_tf = et_r3_3.text.toString()
        val answer_ft = et_r4_3.text.toString()
        val answer_ff = et_r5_3.text.toString()
        return (answer_tt == "T" &&
                answer_tf == "F" &&
                answer_ft == "F" &&
                answer_ff == "F")
    }

    /**
     * Displays a successful Toast message.
     */
    private fun onAnswerCorrect() {
        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_SHORT).show()
    }

    /**
     * Displays a incorrect Toast message.
     */
    private fun onAnswerIncorrect() {
        Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_SHORT).show()
    }
}
