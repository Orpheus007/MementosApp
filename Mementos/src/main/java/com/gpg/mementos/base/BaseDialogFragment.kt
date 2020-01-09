package com.gpg.mementos.base

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.FragmentManager


open class BaseDialogFragment : AppCompatDialogFragment() {
    private var shown = false

    override fun show(manager: FragmentManager, tag: String?) {
        if (shown || manager.isStateSaved) return
        super.show(manager, tag)
        shown = true
    }

    override fun onDismiss(dialog: DialogInterface) {
        shown = false
        super.onDismiss(dialog)
    }

    fun isShowing(): Boolean {
        return shown
    }
}