package com.example.oop

import android.content.Context
import android.util.Log
import android.widget.Toast


class Oak: Plant() {
    private val  type = "Oak"

    fun Plantgrow(context: Context) {

        val result = super.Plantgrow(type,context)

        Toast.makeText(context , result, Toast.LENGTH_LONG ).show()

    }











}