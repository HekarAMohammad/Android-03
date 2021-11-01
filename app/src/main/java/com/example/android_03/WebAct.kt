package com.example.android_03

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.android_03.databinding.ActivitySongactBinding
import com.example.android_03.databinding.ActivityWebBinding

class WebAct : AppCompatActivity() {

    lateinit var binding: ActivityWebBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))
        startActivity(intent)


    }
}