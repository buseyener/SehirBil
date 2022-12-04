package com.buseYener.sehirbil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class hakkinda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hakkinda)
    }

    fun GiriseDon(view: View){
        val intent= Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
    }
}