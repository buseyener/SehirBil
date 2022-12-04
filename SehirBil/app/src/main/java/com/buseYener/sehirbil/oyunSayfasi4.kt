package com.buseYener.sehirbil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class oyunSayfasi4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oyun_sayfasi4)
    }

    fun dogrucevap(view: View){
        Toast.makeText(this, "Doğru Cevap", Toast.LENGTH_SHORT).show()
        var skor= intent.getIntExtra("ücüncüskor",0)
        skor= skor+5
        val intent= Intent(applicationContext,oyunSayfasi5::class.java)
        intent.putExtra("dördüncüskor",  skor)
        startActivity(intent)
        finish()
    }

    fun yanliscevap(view: View){
        Toast.makeText(this, "Yanlış Cevap", Toast.LENGTH_SHORT).show()
        var skor= intent.getIntExtra("ücüncüskor",0)
        skor= skor-3
        val intent= Intent(applicationContext,oyunSayfasi5::class.java)
        intent.putExtra("dördüncüskor",  skor)
        startActivity(intent)
        finish()
    }
}