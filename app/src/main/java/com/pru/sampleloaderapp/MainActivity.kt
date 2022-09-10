package com.pru.sampleloaderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.pru.loader.Loader

class MainActivity : AppCompatActivity() {
    private lateinit var loader : Loader
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loader = Loader(context = this)
        findViewById<Button>(R.id.btnTap).setOnClickListener {
            loader.start()
        }
    }
}