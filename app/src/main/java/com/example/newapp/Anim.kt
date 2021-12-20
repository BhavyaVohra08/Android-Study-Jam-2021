package com.example.newapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

class Anim(contentLayoutId: Int) : AppCompatActivity(contentLayoutId) {
    private val splashScreen = 4000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anim)

        Handler().postDelayed({
            startActivity(intent)
            val intent = Intent(this@Anim, SplashActivity::class.java)
            startActivity(intent)
            finish()
        }, splashScreen.toLong())

    }

}

