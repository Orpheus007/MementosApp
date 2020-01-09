package com.gpg.mementos.bindingAdapters

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.databinding.BindingAdapter
import java.text.DecimalFormat
import java.text.NumberFormat
import java.text.ParseException
import java.util.Locale

@BindingAdapter("onMoneyChange")
fun onMoneyChanged(editText: EditText, watcher: Watcher) {
    val numberFormat = NumberFormat.getNumberInstance(Locale.US)

    val decimalFormat: DecimalFormat = numberFormat as DecimalFormat
    val decimalFormatNumberFormat: DecimalFormat = decimalFormat

    decimalFormat.applyPattern("#,###.##")
    decimalFormat.isDecimalSeparatorAlwaysShown = true
    decimalFormatNumberFormat.applyPattern("#,###")
    val hasFractionalPart: Boolean = false

    editText.addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            editText.removeTextChangedListener(this)

            try {
                val iniLen: Int = editText.text.length
                val endLen: Int = editText.text.length

                val v = s.toString().replace(decimalFormat.decimalFormatSymbols.groupingSeparator.toString(), "")
                val n = decimalFormat.parse(v)
                val cp = editText.selectionStart
                editText.setText(decimalFormatNumberFormat.format(n))
                watcher.afterTextChanged(decimalFormatNumberFormat.format(n))
                val sel = cp + (endLen - iniLen)
                if (sel > 0 && sel <= editText.text.length) {
                    editText.setSelection(sel)
                } else {
                    // place cursor at the end?
                    editText.setSelection(editText.text.length - 1)
                }
            } catch (nfe: NumberFormatException) {
                // do nothing?
            } catch (e: ParseException) {
                // do nothing?
                watcher.afterTextChanged("0")
            }

            editText.addTextChangedListener(this)
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

    })
}

