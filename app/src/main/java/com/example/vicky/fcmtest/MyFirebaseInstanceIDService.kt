package com.example.vicky.fcmtest

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceIdService
import com.google.firebase.iid.FirebaseInstanceId

const val TAG = "MyFirebase"

class MyFirebaseInstanceIDService : FirebaseInstanceIdService(){

    override fun onTokenRefresh() {
        val refreshedToken = FirebaseInstanceId.getInstance().token
        Log.d(TAG, "Refreshed token: " + refreshedToken!!)

        //Send this token to server for later use
    }

}