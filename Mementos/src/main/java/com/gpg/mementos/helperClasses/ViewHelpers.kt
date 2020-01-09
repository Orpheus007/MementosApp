package com.gpg.mementos.helperClasses

import android.view.View
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.google.android.material.textfield.TextInputLayout

fun View.hide() {
    if (this.visibility != View.GONE || this.visibility != View.INVISIBLE) {
        this.visibility = View.GONE
    }
}

fun View.show() {
    if (this.visibility != View.VISIBLE) {
        this.visibility = View.VISIBLE
    }
}

fun View.expand(capacity: Float = 2f) {
    this.animate().scaleY(capacity).scaleX(capacity)
}

fun View.shrink(capacity: Float = 1f) {
    this.animate().scaleX(capacity).scaleY(capacity)
}

fun TextInputLayout.handleError(errorMessage: String? = null) {
    if (errorMessage != null) {
        this.error = errorMessage
        YoYo.with(Techniques.Shake).playOn(this)
    } else {
        this.error = errorMessage
    }
}

fun View.simpleClick() {
    YoYo.with(Techniques.Tada).playOn(this)
}

fun View.shake() {
    YoYo.with(Techniques.Shake).playOn(this)
}