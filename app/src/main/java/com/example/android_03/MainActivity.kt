package com.example.android_03

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

    }

    fun web(view: View) {
        val intent = Intent(this, WebAct::class.java)
        startActivity(intent)
    }
    fun song(view: View) {
        val intent = Intent(this, Songact::class.java)
        startActivity(intent)
    }
    fun vid(view: View) {
        val intent = Intent(this, Vidact::class.java)
        startActivity(intent)
    }
}