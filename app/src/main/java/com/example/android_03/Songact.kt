package com.example.android_03

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import com.example.android_03.databinding.ActivitySongactBinding

class Songact : AppCompatActivity() {


    private var mp: MediaPlayer? = null


    lateinit var binding: ActivitySongactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySongactBinding.inflate(layoutInflater)
        setContentView(binding.root)




        supportActionBar?.hide()

    }

    fun pause(view: View) {
        mp?.pause()
    }
    fun play(view: View) {

        if (mp == null) {
            mp = MediaPlayer.create(this, R.raw.blind_sonf)
        }
        mp?.start()
    }
    fun stop(view: View) {

            mp?.stop()
            mp = null


    }


}





