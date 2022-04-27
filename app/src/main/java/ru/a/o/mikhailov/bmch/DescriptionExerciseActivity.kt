package ru.a.o.mikhailov.bmch

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.Toast
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import ru.a.o.mikhailov.bmch.databinding.ActivityDescriptionExerciseBinding

class DescriptionExerciseActivity : YouTubeBaseActivity() {

    val VIDEO_ID = "B6PoQ_kiYMg"
    private val YOUTUBE_API_KEY = "AIzaSyAJyRFIvaKRJXOfUcLNhZ3GZfzY3pKCGTs"
    lateinit var binding: ActivityDescriptionExerciseBinding
    lateinit var youtubePlayerInit : YouTubePlayer.OnInitializedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDescriptionExerciseBinding.inflate(layoutInflater)
        setContentView(binding.root)
        youtubePlayerInit = object: YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                p1: YouTubePlayer?,
                p2: Boolean
            ) {
                p1?.loadVideo(VIDEO_ID)
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Toast.makeText(applicationContext,"wefe", Toast.LENGTH_LONG).show()
            }

        }

        binding.button.setOnClickListener {
            binding.youtubePlayer.initialize(YOUTUBE_API_KEY, youtubePlayerInit)
        }
    }
}