package com.gpg.mementos.bindingAdapters

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.databinding.BindingAdapter
import java.util.regex.Pattern

@BindingAdapter("onCardChange")
fun onCardChanged(editText: EditText, watcher: Watcher) {
    val space = "-"
    val pattern = Pattern.compile("^(\\d{4}$space){0,3}\\d{1,4}$")

    editText.addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            watcher.afterTextChanged(s.toString().trim())
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            val currentText = editText.text.toString()
            if (currentText.isEmpty() || pattern.matcher(currentText).matches())
                return  // no need to modify
            val numbersOnly = currentText.trim { it <= ' ' }.replace("[^\\d.]".toRegex(), "")
            var formatted = ""
            var i = 0
            while (i < numbersOnly.length) {
                formatted += if (i + 4 < numbersOnly.length)
                    numbersOnly.substring(i, i + 4) + space
                else
                    numbersOnly.substring(i)
                i += 4
            }
            editText.setText(formatted)
            editText.setSelection(editText.text.toString().length)
        }

    })
}