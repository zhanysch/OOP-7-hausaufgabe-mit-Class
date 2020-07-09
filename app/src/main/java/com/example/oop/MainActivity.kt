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

        val rose=Rose()
        val cactus=Cactus()
        val oak = Oak()

        Btnrose.setOnClickListener {
            rose.makeAction()



            Toast.makeText(applicationContext, "Роза растет", Toast.LENGTH_LONG ).show()

        }

        Btncactus.setOnClickListener {
            cactus.makeAction()

            Toast.makeText(applicationContext, "Кактус растет ", Toast.LENGTH_LONG ).show()

        }



        BtnOAK.setOnClickListener{

            oak.makeAction()

            Toast.makeText(applicationContext, "Дуб растет", Toast.LENGTH_LONG ).show()

        }
    }
}