package com.daniellanunes.meuprimeiroprojeto

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SorteadorDeNumeros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        }


    fun sortear(view: View) {
        val textoResultado = findViewById<TextView>(R.id.text_resultado) //encontre um item de interface pelo ID
        val numero = java.util.Random().nextInt(61)// 0..60 gera numero aleatório
        textoResultado.setText("Número Gerado: $numero")
    }


}