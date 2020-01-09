package com.gpg.mementos.helperClasses

import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import com.google.gson.GsonBuilder
import com.google.gson.JsonParser

fun String.partialTextsBold(): SpannableStringBuilder {
    var copy = this
    return SpannableStringBuilder().apply {
        var setSpan = true
        var next: String
        do {
            setSpan = !setSpan
            next = if (length == 0) copy.substringBefore("**", "") else copy.substringBefore("**")
            val start = length
            append(next)
            if (setSpan) {
                setSpan(
                        StyleSpan(Typeface.BOLD), start, length,
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                )
            }
            copy = copy.removePrefix(next).removePrefix("**")
        } while (copy.isNotEmpty())
    }
}

suspend fun String.beautify(): String {
    return GsonBuilder().setPrettyPrinting().create().toJson(JsonParser.parseString(this))
}