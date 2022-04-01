package com.example.textviewdesign

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.textviewdesign.textviewSet.TextViewSetting

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openTextviewSettingPage(this)

    }

    private fun openTextviewSettingPage(mActivity: Activity) {
        val iIntent = Intent()
        iIntent.setClass(mActivity, TextViewSetting::class.java)
        startActivity(iIntent)
    }
}