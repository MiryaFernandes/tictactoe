package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tela_dificuldade : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_dificuldade)

        val facil = findViewById<Button>(R.id.facil)
        val medio = findViewById<Button>(R.id.medio)
        val dificil = findViewById<Button>(R.id.dificil)
        val doisJogadores = findViewById<Button>(R.id.doisjogadores) as Button

        doisJogadores.setOnClickListener() {

            irParaDoisJogadores()

        }
    }
    private fun irParaDoisJogadores(){
        val doisJogadores = Intent(this, MainActivity::class.java)
        startActivity(doisJogadores)
    }
}