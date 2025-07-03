package com.example.smartreminder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.smartreminder.databinding.ActivityMoveReminderBinding

class MoveReminderActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMoveReminderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveReminderBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
