package com.pru.sampleloaderapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.pru.loader.LoaderDialog
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var loaderDialog: LoaderDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loaderDialog = LoaderDialog(context = this)
        findViewById<Button>(R.id.btnTap).setOnClickListener {
            lifecycleScope.launch {
                loaderDialog.show()
                delay(3000)
                loaderDialog.dismiss()
            }

        }
    }
}