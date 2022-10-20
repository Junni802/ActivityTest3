package com.example.activitytest3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitytest3.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
	val binding by lazy { ActivitySubBinding.inflate(layoutInflater) }
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		binding.txt.text = intent.getStringExtra("name")
		binding.subGender.text = intent.getStringExtra("gender")

		binding.reset.setOnClickListener { finish() }
	}
}