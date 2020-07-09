package com.example.oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Btnrose = findViewById<Button>(R.id.Btnrose)
        val Btncactus = findViewById<Button>(R.id.Btncactus)


        Btnrose.setOnClickListener {
            val rose = Rose()
            rose.Plantgrow(applicationContext)

        }

        Btncactus.setOnClickListener {

            val cactus = Cactus()
            cactus.Plantgrow(applicationContext)

        }



        BtnOAK.setOnClickListener{

            val oak = Oak()
            oak.Plantgrow(applicationContext)



        }
    }
}