package com.example.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val artist: String = "Mathias"
        artist.toString()

        var song: String = "Winner"
        song.toString()

        val released : Int = 2018
        released.toString()

        var genre: String = "pop"
        genre.toString()

        val duration : Float = 2.23f
        duration.toString()

        val album : String = "loaded"
        album.toString()

        Log.d("artist", "Mathias")
        Log.d("song", "Winner")
        Log.d("released", "2018")
        Log.d("genre", "pop")
        Log.d("duration", "2.23")
        Log.d("album", "loaded")





    }
}