package com.gpg.mementos.base

import android.os.Bundle
import android.view.View
import com.airbnb.lottie.LottieAnimationView
import com.gpg.mementos.helperClasses.hide
import com.gpg.mementos.helperClasses.show

class BaseLoadingActivity : BaseActivity() {


    private lateinit var pageLoadingHolder: View
    private lateinit var pageLoading: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showPageLoading()
    }

    fun showPageLoading() {
        pageLoadingHolder.show()
        pageLoading.playAnimation()
    }

    fun hidePageLoading() {
        pageLoadingHolder.hide()
        pageLoading.cancelAnimation()
    }
}