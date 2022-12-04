package com.buseYener.sehirbil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ulkesayfasi1 : AppCompatActivity() {
    var skor=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ulkesayfasi1)
    }

    fun dogrucevap(view: View){
        skor = skor+5
        Toast.makeText(this, "Doğru Cevap" , Toast.LENGTH_SHORT).show()
        val intent= Intent(applicationContext,ulkesayfasi2::class.java)
        intent.putExtra("1skor",  skor)
        startActivity(intent)
        finish()
    }
    fun yanliscevap(view: View){
        skor= skor-3
        Toast.makeText(this, "Yanlış Cevap", Toast.LENGTH_SHORT).show()
        val intent= Intent(applicationContext,ulkesayfasi2::class.java)
        intent.putExtra("1skor",skor)
        startActivity(intent)
        finish()
    }
}