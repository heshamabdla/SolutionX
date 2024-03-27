package com.example.solutionx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.solutionx.databinding.ActivityMainBinding
import com.example.solutionx.feautres.login.presentation.MainViewModel
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val hashMap=HashMap<Any,Any>()
        binding.buttonLogin.setOnClickListener {
            hashMap["phone[country_code]"] = binding.editCountryCode.text.toString()
            hashMap["phone[number]"] = binding.editPhone.text.toString()
            hashMap["password"] = binding.editPassword.text.toString()
            viewModel.loginWithPhone(hashMap)

        }


        lifecycleScope.launch {

            viewModel.loginUser.collect() {

            }
        }



    }
}