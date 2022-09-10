package com.pru.loader

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import com.bumptech.glide.Glide
import com.pru.loader.databinding.LoadingDialogBinding

class Loader(context: Context) : Dialog(context) {
    private var binding: LoadingDialogBinding = LoadingDialogBinding.inflate(layoutInflater)

    init {
        setContentView(binding.root)
        this.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        this.setCancelable(false)
    }


    fun start(
        message: CharSequence? = "Loading..."
    ): Loader {
        this.setMessage(message)
        Glide.with(context)
            .load(R.drawable.loader)
            .into(binding.pbView)
        this.show()
        return this
    }

    fun stop(){
        this.dismiss()
    }

    private fun setMessage(message: CharSequence?) {
        binding.tvMessage.text = message
    }
}