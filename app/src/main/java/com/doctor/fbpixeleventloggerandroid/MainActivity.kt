package com.doctor.fbpixeleventloggerandroid

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.facebook.appevents.AppEventsLogger
import java.util.Currency


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logCustomEvent("RUN_BY_JENKINS")
        logCustomEvent("HomeScreen_Android")
    }

    private fun logCustomEvent(eventName: String) {
        val logger = AppEventsLogger.newLogger(this)
        logger.logEvent(eventName)
    }
}
