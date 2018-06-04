package com.example.vicky.fcmtest

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService(){

    override fun onMessageReceived(p0: RemoteMessage?) {

        Log.d(TAG," onMessageReceived ")
        if(p0?.data!!.isNotEmpty()){
            Log.d(TAG, " Data : " + p0.data.toString())
        }

        if(p0.notification != null){
            Log.d(TAG," Notification : " + p0.notification!!.body.toString())
        }

    }

}