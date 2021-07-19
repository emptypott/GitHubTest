package com.example.githubapitest

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LinkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_link)

        val intent : Intent? = intent
        if(Intent.ACTION_VIEW.equals(intent?.action)) {
            val uri : Uri? = intent?.data

            Log.d("jeongsu", uri.toString())
        }
    }
}