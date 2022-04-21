package ru.a.o.mikhailov.bmch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.a.o.mikhailov.bmch.databinding.ActivityChangeExercisesBinding

class ChangeExercisesActivity : AppCompatActivity() {

    lateinit var binding: ActivityChangeExercisesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangeExercisesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageButtonPushUps.setOnClickListener{

        }
        binding.imageButtonPullUps.setOnClickListener{

        }
        binding.imageButtonSquats.setOnClickListener{

        }
    }
}