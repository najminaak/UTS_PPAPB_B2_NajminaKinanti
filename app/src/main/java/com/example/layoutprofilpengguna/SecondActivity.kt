package com.example.layoutprofilpengguna

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.layoutprofilpengguna.databinding.ActivityMainBinding
import com.example.layoutprofilpengguna.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            val username = intent.getStringExtra("USERNAME")
            txtUsername.text = username

            btnKeluar.setOnClickListener {
                val intent = Intent(this@SecondActivity, ThirdActivity::class.java)
                startActivity(intent)
                Toast.makeText(this@SecondActivity, "You have successfully logged out", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

