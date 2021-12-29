package com.trivia.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.trivia.R
import com.trivia.databinding.ActivityMainBinding
import com.trivia.ui.activity.view_model.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainActivityVM: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        init()
    }

    fun init() {
        mainActivityVM = ViewModelProvider(this)[MainActivityViewModel::class.java]
        mainActivityVM.getQuestionAnswerData(this)
        binding.mainActivityVM = mainActivityVM
        binding.lifecycleOwner = this
    }
}