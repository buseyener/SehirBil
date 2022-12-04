package com.buseYener.sehirbil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_kayit_sayfasi.*

class KayitSayfasi : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kayit_sayfasi)
        auth=FirebaseAuth.getInstance()

    }

    fun GiriseDön(view: View){
        val intent= Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
    }

    fun Kaydet(view: View){


        val email= kayitemail.text.toString()
        val sifre=password.text.toString()
        auth.createUserWithEmailAndPassword(email,sifre).addOnCompleteListener{task ->
            if (task.isSuccessful){
                Toast.makeText(this, "Kayıt Başarılı! Girişe Dönebilirsiniz.", Toast.LENGTH_LONG).show()

            }
        }.addOnFailureListener{ exception ->
            Toast.makeText(this, exception.localizedMessage, Toast.LENGTH_LONG).show()
        }


    }





}