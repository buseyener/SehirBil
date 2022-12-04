package com.buseYener.sehirbil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_kayit_sayfasi.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var auth:FirebaseAuth
    var skor= 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth=FirebaseAuth.getInstance()

        Toast.makeText(this,"Hoşgeldiniz!",Toast.LENGTH_LONG).show()









    }

    fun oyunaGrsSayfasinaGit(view: View){

        val mailgiris= kayitKullanici.text.toString()
        val sifregiris= kayitparola.text.toString()
        auth.signInWithEmailAndPassword(mailgiris,sifregiris).addOnCompleteListener { task ->
            if (task.isSuccessful){

                val guncelkullanici=auth.currentUser?.email.toString()
                Toast.makeText(this, "Hoşgeldin: ${guncelkullanici}", Toast.LENGTH_LONG).show()
                val intent= Intent(applicationContext,oyunsecmeEkrani::class.java)
                startActivity(intent)
            }
        }.addOnFailureListener { exception ->
            Toast.makeText(this, exception.localizedMessage, Toast.LENGTH_LONG).show()
        }






    }

    fun KayitSayfasinaGit(view: View){
        val intent= Intent(applicationContext,KayitSayfasi::class.java)
        startActivity(intent)


    }

    fun HakkindaSayfasinaGit(view: View){
        val intent= Intent(applicationContext,hakkinda::class.java)
        startActivity(intent)
    }
}