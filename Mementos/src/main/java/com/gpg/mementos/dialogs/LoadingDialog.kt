package com.gpg.mementos.dialogs

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.airbnb.lottie.utils.LottieValueAnimator
import com.gpg.mementos.R
import com.gpg.mementos.base.BaseDialogFragment
import com.gpg.mementos.databinding.LoadingDialogBinding

class LoadingDialog : BaseDialogFragment() {

    private lateinit var binding: LoadingDialogBinding

    companion object {
        fun newInstance(): LoadingDialog = LoadingDialog()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.loading_dialog, container, false)

        binding = LoadingDialogBinding.bind(view)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        this.isCancelable = false
        binding.one.repeatCount = LottieValueAnimator.INFINITE
        binding.one.playAnimation()
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(activity!!, R.color.full_transparent)))
    }

    override fun onPause() {
        binding.one.cancelAnimation()
        super.onPause()
    }

    override fun onResume() {
        binding.one.playAnimation()
        super.onResume()
    }
}