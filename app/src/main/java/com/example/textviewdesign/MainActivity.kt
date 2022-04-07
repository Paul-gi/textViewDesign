package com.example.textviewdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.textviewdesign.databinding.ActivityMainBinding
import com.example.textviewdesign.textviewSet.ArticleTest
import com.example.textviewdesign.textviewSet.TextViewSetting

class MainActivity : AppCompatActivity() {
    private lateinit var mActivityMainBinding: ActivityMainBinding
    private val mIntent = Intent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initView()
    }

    private fun initView() {
        mActivityMainBinding.AllTextView.setOnClickListener {
            mIntent.setClass(this, TextViewSetting::class.java)
            startActivity(mIntent)
        }

        mActivityMainBinding.articleTest.setOnClickListener {
            mIntent.setClass(this, ArticleTest::class.java)
            startActivity(mIntent)
        }

    }

}