package com.example.smartreminder

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.smartreminder.databinding.ActivityExerciseCheckBinding

class ExerciseCheckActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExerciseCheckBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseCheckBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnYes.setOnClickListener {
            // Aquí puedes guardar que sí lo hizo o pasar a otra pantalla
            finish() // o mostrar un Toast, etc.
        }

        binding.btnSkip.setOnClickListener {
            finish() // O simplemente cerrar sin guardar
        }
    }
}
