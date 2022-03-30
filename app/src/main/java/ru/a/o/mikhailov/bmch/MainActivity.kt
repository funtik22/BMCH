package ru.a.o.mikhailov.bmch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.a.o.mikhailov.bmch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.buttonStartTrain.setOnClickListener{
            val intent = Intent(this, ChangeExercisesActivity::class.java)
            startActivity(intent)
        }
    }
}