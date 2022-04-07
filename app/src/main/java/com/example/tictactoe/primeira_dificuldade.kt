package com.example.tictactoe

import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.Toast

class primeira_dificuldade : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeira_dificuldade)
    }

    fun Clickfun(view: View) {

        val btSelecionado = view as Button
        var cellID = 0

        when (btSelecionado.id) {

            R.id.button -> cellID = 1
            R.id.button2 -> cellID = 2
            R.id.button3 -> cellID = 3
            R.id.button4 -> cellID = 4
            R.id.button5 -> cellID = 5
            R.id.button6 -> cellID = 6
            R.id.button7 -> cellID = 7
            R.id.button8 -> cellID = 8
            R.id.button9 -> cellID = 9

        }

        //Toast.makeText(this, "ID: "+cellID, Toast.LENGTH_SHORT).show()
        playGame(cellID, btSelecionado)

    }

    //array's para guardar a jogada de cada jogador
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()

    //turno do jogador
    var activeplayer = 1

    fun playGame(cellID:Int, btSelecionado: Button){

        if(activeplayer == 1){

            btSelecionado.text = "x"
            btSelecionado.setBackgroundColor(Color.TRANSPARENT)
            player1.add(cellID)
            activeplayer = 2
        } else {

            btSelecionado.text = "o"
            btSelecionado.setBackgroundColor(Color.TRANSPARENT)
            player2.add(cellID)
            activeplayer = 1
        }

        btSelecionado.isEnabled = false
        checkWiner()

    }



    fun checkWiner() {
        var winer = -1

        //linha 1
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {

            winer = 1

        }

        if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {

            winer = 2

        }

        //linha 2
        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {

            winer = 1

        }

        if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {

            winer = 2

        }

        //linha 3
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {

            winer = 1

        }

        if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {

            winer = 2

        }

        //////////////////////////////////colunas////////////////////////////////
        //coluna 1
        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {

            winer = 1

        }

        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {

            winer = 2

        }

        //coluna 2
        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {

            winer = 1

        }

        if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {

            winer = 2

        }

        //coluna 3
        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {

            winer = 1

        }

        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {

            winer = 2

        }

        //////////////////////////////////diagonal////////////////////////////////
        //principal
        if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {

            winer = 1

        }

        if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {

            winer = 2

        }

        //secundaria
        if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {

            winer = 1

        }

        if (player2.contains(3) && player2.contains(5) && player2.contains(7)) {

            winer = 2

        }



        //winer
        if (winer!=-1) {
            if (winer==1) {
                Toast.makeText(this, "Player 1 win the game!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Player 2 win the game!", Toast.LENGTH_SHORT).show()
            }

        }

    }
}