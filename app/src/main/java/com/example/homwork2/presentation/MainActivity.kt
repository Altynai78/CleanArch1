package com.example.homwork2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homwork2.presentation.BaseViewModel
import com.example.homwork2.presentation.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding, BaseViewModel>() {

    override fun inflateViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun setUI() {
        super.setUI()
    }

    override fun initClickListener() {
        super.initClickListener()
    }

}