package com.github.kiolk.samplefacebooksdk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var logger : AppEventsLogger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logger = AppEventsLogger.newLogger(baseContext)


        button1.setOnClickListener {
            Toast.makeText(baseContext, "Press button 1", Toast.LENGTH_SHORT).show()
            logger.logEvent("Press button 1")
        }
        button2.setOnClickListener {
            Toast.makeText(baseContext, "Press button 2", Toast.LENGTH_SHORT).show()
            logger.logEvent("Press button 2")
        }
        button3.setOnClickListener {
            Toast.makeText(baseContext, "Press button 3", Toast.LENGTH_SHORT).show()
            logger.logEvent("Press button 3")
        }
    }
}
