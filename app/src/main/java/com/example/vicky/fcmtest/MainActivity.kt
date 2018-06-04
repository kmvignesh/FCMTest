package com.example.vicky.fcmtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FirebaseMessaging.getInstance().isAutoInitEnabled = true

        if(intent.extras != null){
            Log.d(TAG,"intent : " + intent.extras)
        }
    }
}
