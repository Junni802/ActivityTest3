package com.example.activitytest3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import com.example.activitytest3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)
/*
		binding.name.addTextChangedListener {

		val intent = Intent(this,SubActivity::class.java)

		intent.putExtra("name", "이름 : ${it.toString()} ")

		binding.btn1.setOnClickListener { startActivity(intent) }
		}
*/
		var gender1 : String = ""
		binding.rdoGroup.setOnCheckedChangeListener { radioGroup, i -> if(i == R.id.man) gender1 = "남자" else gender1= "여자" }

		binding.btn1.setOnClickListener {
			val intent = Intent(this,SubActivity::class.java)

			intent.putExtra("name", "이름 : ${binding.name.text} ")
			intent.putExtra("gender", "성별 : ${gender1}")



			startActivity(intent)
		}

	}
}