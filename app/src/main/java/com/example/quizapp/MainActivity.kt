package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.quizapp.ui.QuestionsActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: Button = findViewById(R.id.button_start)
        val editTextName: EditText = findViewById(R.id.name)

        startButton.setOnClickListener {
            if (editTextName.text.isEmpty()) {
                Toast.makeText(this, getString(R.string.empty_name_error), Toast.LENGTH_LONG).show()
            } else {
                Intent(this@MainActivity, QuestionsActivity::class.java).also {
                    startActivity(it)
                    finish()
                }
            }
        }

    }
}