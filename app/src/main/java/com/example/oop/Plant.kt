package com.example.oop

import android.content.Context
import android.widget.Toast

open class Plant {

    protected fun Plantgrow (typeofPlant: String,context: Context ): String {

       val result:String = "растение растет" + typeofPlant


      return result }



}