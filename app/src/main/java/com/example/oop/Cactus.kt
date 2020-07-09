package com.example.oop

import android.content.Context
import android.util.Log
import android.widget.Toast

class Cactus: Plant() {



    private val  type = "Cactus"

    fun Plantgrow(context: Context) {

        val result = super.Plantgrow(type,context)

        Toast.makeText(context , result, Toast.LENGTH_LONG ).show()

    }





}