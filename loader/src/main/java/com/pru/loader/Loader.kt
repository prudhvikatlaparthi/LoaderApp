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
    }


    fun show(
        message: CharSequence? = "Loading..."
    ): Loader {
        this.setMessage(message)
        this.setCancelable(false)
        Glide.with(context)
            .load(R.drawable.loader)
            .into(binding.pbView)
        this.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        this.show()
        return this
    }

    private fun setMessage(message: CharSequence?) {
        binding.tvMessage.text = message
    }
}