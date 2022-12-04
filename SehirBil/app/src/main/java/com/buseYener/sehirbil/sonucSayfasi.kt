package com.buseYener.sehirbil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_sonuc_sayfasi.*

class sonucSayfasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonuc_sayfasi)


        if ( intent.getIntExtra("yedinciskor",0)== 0){
           var skor = intent.getIntExtra("7skor" ,0)
             sonuc.text="Skor: ${skor}"
        }
        else{
            var skor= intent.getIntExtra("yedinciskor",0)
             sonuc.text="Skor: ${skor}"
        }

       // var skor= intent.getIntExtra("yedinciskor",0)
       // sonuc.text="Skor: ${skor}"



    }
    fun cikis(view: View){
        moveTaskToBack(true);
    }

    fun oyunsecmeEkraninaGit(view: View){
        val intent= Intent(applicationContext,oyunsecmeEkrani::class.java)
        startActivity(intent)
    }

}