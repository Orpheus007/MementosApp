package com.gpg.mementos.base

import android.content.Context
import android.content.Intent
import android.os.Build
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import com.gpg.mementos.R
import com.gpg.mementos.helperClasses.ViewModelFactory
import dagger.android.support.DaggerAppCompatActivity

open class BaseActivity : DaggerAppCompatActivity() {

    inline fun <reified T : ViewModel> ViewModelFactory<T>.get(): T = androidx.lifecycle.ViewModelProvider(this@BaseActivity, this)[T::class.java]

    fun changeStatusBarAndNavBarColor(statusBarColor: Int , bottomNavButtonsColor: Int) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window = window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = ContextCompat.getColor(this, statusBarColor)
            window.navigationBarColor = ContextCompat.getColor(this, bottomNavButtonsColor)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (statusBarColor == R.color.white) {
                    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
                }
            }
        }
    }

    fun appExit() {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    }

    fun FragmentActivity.dismissKeyboard() {
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        if (inputMethodManager.isAcceptingText)
            inputMethodManager.hideSoftInputFromWindow(this.currentFocus?.windowToken, /*flags:*/ 0)
    }

}