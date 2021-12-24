package com.example.caclmvvmexapleandroid.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.caclmvvmexapleandroid.databinding.ActivityMainBinding
import com.example.caclmvvmexapleandroid.viewmodels.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mainActivityViewModel = MainActivityViewModel()
        binding.viewModel = mainActivityViewModel
    }
}