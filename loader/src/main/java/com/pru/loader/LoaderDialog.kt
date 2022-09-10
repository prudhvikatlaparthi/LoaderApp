package com.pru.loader

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import com.bumptech.glide.Glide
import com.pru.loader.databinding.LoadingDialogBinding

class LoaderDialog(context: Context) : Dialog(context) {
    private var binding: LoadingDialogBinding = LoadingDialogBinding.inflate(layoutInflater)

    init {
        setContentView(binding.root)
        this.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        this.setCancelable(false)
    }

    override fun show() {
        this.setMessage(binding.tvMessage.text)
        Glide.with(context)
            .load(R.drawable.loader)
            .into(binding.pbView)
        super.show()
    }

    private fun setMessage(message: CharSequence?) {
        binding.tvMessage.text = message
    }
}