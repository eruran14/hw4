package com.eru.kotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.eru.kotlin1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var sum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            if (sum == 10 || binding.btn1.text.equals("-1")) {
                binding.btn1.text = "-1"
                sum--
                binding.textview.text = sum.toString()
                if (sum == 0){
                    binding.btn1.text = "+1"
                }
            }
            else{
                sum++
                binding.textview.text = sum.toString()
            }
        }
    }
}
