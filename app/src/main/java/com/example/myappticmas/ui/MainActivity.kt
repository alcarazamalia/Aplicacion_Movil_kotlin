package com.example.myappticmas.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myappticmas.R

class MainActivity : AppCompatActivity() {
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var textViewResult: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        textViewResult = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        button.setOnClickListener(View.OnClickListener() {
            // Obtener el texto de los EditText
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()

            // Comparar los textos
            if (text1 == text2) {
                textViewResult.text = "Los textos son iguales."
            } else {
                textViewResult.text = "Los textos son diferentes."
            }
            // Limpiar los EditText
            editText1.text.clear()
            editText2.text.clear()

        });
    }
}