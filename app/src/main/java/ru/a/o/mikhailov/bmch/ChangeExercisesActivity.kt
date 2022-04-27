package ru.a.o.mikhailov.bmch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.youtube.player.YouTubeBaseActivity
import ru.a.o.mikhailov.bmch.databinding.ActivityChangeExercisesBinding

class ChangeExercisesActivity : AppCompatActivity() {

    lateinit var binding: ActivityChangeExercisesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangeExercisesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageButtonPushUps.setOnClickListener{
            val intent = Intent(this, DescriptionExerciseActivity::class.java)
            startActivity(intent)
        }
        binding.imageButtonPullUps.setOnClickListener{

        }
        binding.imageButtonSquats.setOnClickListener{

        }
    }
}