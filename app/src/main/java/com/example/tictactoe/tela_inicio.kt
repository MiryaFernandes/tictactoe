package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tela_inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicio)

        val start = findViewById<Button>(R.id.start) as Button

        start.setOnClickListener() {

            irParaTelaDificuldade()

        }
    }
    private fun irParaTelaDificuldade(){
        val telaDificuldade = Intent(this,tela_dificuldade::class.java)
        startActivity(tela_dificuldade)
    }
}