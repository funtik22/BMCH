package ru.a.o.mikhailov.bmch

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Toast
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import ru.a.o.mikhailov.bmch.databinding.ActivityDescriptionExerciseBinding

class DescriptionExerciseActivity : YouTubeBaseActivity() {

    val VIDEO_ID = "6SkKPgKX_gY"
    private val YOUTUBE_API_KEY = "AIzaSyAJyRFIvaKRJXOfUcLNhZ3GZfzY3pKCGTs"
    lateinit var binding: ActivityDescriptionExerciseBinding
    lateinit var youtubePlayerInit : YouTubePlayer.OnInitializedListener

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDescriptionExerciseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNext.setOnClickListener {
            intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }
        binding.tvDescriptionExercise.movementMethod = ScrollingMovementMethod()
        ("• ровное расположение тела, без прогиба поясницы и провала груди;\n\n" +
                "• руки расположить чуть шире плеч, перпендикулярно к полу;\n\n" +
                "• подъем и опускание должны происходить плавно;\n\n" +
                "• соблюдать правильное дыхание: на опускание делать вдох, а на подъеме — выдох;\n\n" +
                "• при опускании руки уходят не широко и не вдоль туловища (примерно 45 градусов, относительно тела);\n\n" +
                "• в верхней точке следует округлять грудной отдел позвоночника, сводить грудные мышцы;\n\n" +
                "• опускаться примерно до того, чтобы расстояние до пола было примерно 10-15 сантиметров.\n\n").also { binding.tvDescriptionExercise.text = it }

        youtubePlayerInit = object: YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                p1: YouTubePlayer?,
                p2: Boolean
            ) {
                p1?.cueVideo(VIDEO_ID)
                p1?.addFullscreenControlFlag(YouTubePlayer.FULLSCREEN_FLAG_CUSTOM_LAYOUT)
                p1?.setOnFullscreenListener {
                    if (it) {
                        p1.setFullscreen(true)
                    }
                }
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Toast.makeText(applicationContext,"wefe", Toast.LENGTH_LONG).show()
            }

        }
        binding.youtubePlayer.initialize(YOUTUBE_API_KEY, youtubePlayerInit)


    }
}