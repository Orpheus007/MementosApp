package com.gpg.mementos.listeners

import android.view.View
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

abstract class OneClickListener(private var delay: Long = 1000, private val scope: CoroutineScope) : View.OnClickListener {
    private var hasClicked: Boolean = true

    override fun onClick(it: View) {
        if (!hasClicked) {
            reboundMessage()
            return
        } else {
            hasClicked = false
            onClicked(it)
            scope.launch {
                delay(delay)
                hasClicked = true
            }
        }
    }

    abstract fun onClicked(it: View)

    abstract fun reboundMessage()
}