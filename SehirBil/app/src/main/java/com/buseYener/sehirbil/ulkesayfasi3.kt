package com.buseYener.sehirbil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ulkesayfasi3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ulkesayfasi3)
    }
    fun dogrucevap(view: View){
        Toast.makeText(this, "Doğru Cevap", Toast.LENGTH_SHORT).show()
        var skor= intent.getIntExtra("2skor",0)
        skor= skor+5
        val intent= Intent(applicationContext,ulkesayfasi4::class.java)
        intent.putExtra("3skor",  skor)
        startActivity(intent)
        finish()
    }

    fun yanliscevap(view: View){
        Toast.makeText(this, "Yanlış Cevap", Toast.LENGTH_SHORT).show()
        var skor= intent.getIntExtra("2skor",0)
        skor= skor-3
        val intent= Intent(applicationContext,ulkesayfasi4::class.java)
        intent.putExtra("3skor",  skor)
        startActivity(intent)
        finish()
    }
}