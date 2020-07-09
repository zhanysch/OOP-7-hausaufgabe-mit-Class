package com.example.oop

import android.content.Context
import android.util.Log
import android.widget.Toast

class Rose: Plant() {

    private val  type = "Rose"

    fun Plantgrow(context: Context) {

        val result = super.Plantgrow(type,context)

        Toast.makeText(context , result, Toast.LENGTH_LONG ).show()

    }

}





