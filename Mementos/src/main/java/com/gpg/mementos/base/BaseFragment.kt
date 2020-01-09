package com.gpg.mementos.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gpg.mementos.helperClasses.ViewModelFactory
import dagger.android.support.DaggerFragment

class BaseFragment : DaggerFragment() {

    inline fun <reified T : ViewModel> ViewModelFactory<T>.get(): T = ViewModelProvider(this@BaseFragment, this)[T::class.java]


}