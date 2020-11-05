package com.lindronics.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.lindronics.test1.services.TestService

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        findViewById<Button>(R.id.start).setOnClickListener {
            startService(Intent(this, TestService::class.java))
        }
        findViewById<Button>(R.id.stop).setOnClickListener {
            stopService(Intent(this, TestService::class.java))
        }
    }
}