package com.buseYener.sehirbil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class oyunsecmeEkrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oyunsecme_ekrani)
    }

    fun sehirtahmin(view: View){
        val intent= Intent(applicationContext,oyunSayfasi1::class.java)
        startActivity(intent)
    }

    fun ülketahmin(view: View){
        val intent= Intent(applicationContext,ulkesayfasi1::class.java)
        startActivity(intent)
    }
}