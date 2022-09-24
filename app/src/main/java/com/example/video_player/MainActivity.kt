package com.example.video_player

import android.net.Uri
import android.net.Uri.parse
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import com.example.video_player.databinding.ActivityMainBinding
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//Find the VideoView class by its id

        val videoView = findViewById<VideoView>(R.id.testView)

//Creating MediaController

        val mediaController = MediaController(this)

        mediaController.setAnchorView(videoView)

//specify the location of media file

        val uri:Uri = parse(

            "android.resource://" + packageName

                    + "/raw/test"

        )

//Setting MediaController and URI, then starting the videoView

        videoView.setMediaController(mediaController)

        videoView.setVideoURI(uri)

        videoView.requestFocus()

        videoView.start()
    }

}