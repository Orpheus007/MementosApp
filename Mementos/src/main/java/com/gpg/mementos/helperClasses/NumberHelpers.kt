package com.gpg.mementos.helperClasses

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols

fun Long.formatToAccountNumber(): String {
    val pattern = "####,####,####,####"
    val symbols = DecimalFormatSymbols()
    symbols.groupingSeparator = '-'
    val df = DecimalFormat(pattern, symbols)
    return df.format(this)
}

fun Int.formatNumber(): String {
    val input = this
    var s: String
    if (input < 1000) {
        return if (input < 100) {
            if (input < 10) {
                "0,00$input TND"
            } else {
                "0,0$input TND"
            }
        } else {
            "0,$input TND"
        }
    } else {
        val df = DecimalFormat("###,###,###")
        s = "" + df.format(input.toLong())
        s = s.replace("\\s".toRegex(), ",")
        s = "$s TND"
        return s
    }
}