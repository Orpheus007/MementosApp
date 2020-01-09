package com.gpg.mementos

import android.content.Context
import com.gpg.mementos.helperClasses.formatNumber
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.ByteArrayOutputStream
import java.security.MessageDigest
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import java.util.zip.GZIPInputStream
import java.util.zip.GZIPOutputStream

fun provideCurrentDate(): String {
    val c = Calendar.getInstance().time
    val df = SimpleDateFormat("dd-MM-yyyy hh:mm", Locale.getDefault())
    return df.format(c)
}


fun formatDate(timeString: String): String {

    val secondMillis = 1000
    val minutesMillis = 60 * secondMillis
    val hourMillis = 60 * minutesMillis
    val dayMillis = 24 * hourMillis

    var time = timeString.toLong()
    if (time < 1000000000000L) {
        // if timestamp given in seconds, convert to millis
        time *= 1000
    }

    val now: Long = System.currentTimeMillis()
    if (time > now || time <= 0) {
        return ""
    }

    val diff = now - time
    return when {
        diff < minutesMillis -> "just now"
        diff < 2 * minutesMillis -> "a minute ago"
        diff < 50 * minutesMillis -> "" + diff / minutesMillis + " minutes ago"
        diff < 90 * minutesMillis -> "an hour ago"
        diff < 24 * hourMillis -> "" + diff / hourMillis + " hours ago"
        diff < 48 * hourMillis -> "yesterday"
        else -> "" + diff / dayMillis + " days ago"
    }
}


suspend fun CoroutineScope.onMainThread(block: () -> Unit): Any {
    return withContext(Dispatchers.Main) {
        block()
    }
}

suspend fun CoroutineScope.onThread(block: () -> Any): Any {
    return withContext(Dispatchers.Default) {
        block()
    }
}

val <T> T.exhaustive: T
    get() = this

fun productTotal(quantity: Int, price: Int): String = (quantity * price).formatNumber()

fun dateSplitter(date: String, context: Context): Array<String> {
    val firstWord = date.split(" ")[0]
    val str = firstWord.split("-")
    val day = str[2]
    var month = ""

    when (str[1]) {
        "01" -> month = context.resources.getString(R.string.jan)
        "02" -> month = context.resources.getString(R.string.feb)
        "03" -> month = context.resources.getString(R.string.mar)
        "04" -> month = context.resources.getString(R.string.apr)
        "05" -> month = context.resources.getString(R.string.may)
        "06" -> month = context.resources.getString(R.string.jun)
        "07" -> month = context.resources.getString(R.string.jul)
        "08" -> month = context.resources.getString(R.string.aug)
        "09" -> month = context.resources.getString(R.string.sept)
        "10" -> month = context.resources.getString(R.string.oct)
        "11" -> month = context.resources.getString(R.string.nov)
        "12" -> month = context.resources.getString(R.string.dec)
    }
    val year = str[0]
    return arrayOf(day, month, year)
}

fun getCurrentTimeAsID(): Long = System.currentTimeMillis()

fun sha1(input: String): String {
    return hashString("SHA-1", input)
}

private fun hashString(type: String, input: String): String {
    val HEX_CHARS = "0123456789abcdef"
    val bytes = MessageDigest
            .getInstance(type)
            .digest(input.toByteArray())
    val result = StringBuilder(bytes.size * 2)

    bytes.forEach {
        val i = it.toInt()
        result.append(HEX_CHARS[i shr 4 and 0x0f])
        result.append(HEX_CHARS[i and 0x0f])
    }

    return result.toString()
}

suspend fun String.compress(): ByteArray {
    val bos = ByteArrayOutputStream()
    GZIPOutputStream(bos).bufferedWriter(Charsets.UTF_8).use { it.write(this) }
    return bos.toByteArray()
}

suspend fun ByteArray.deCompress(): String = GZIPInputStream(this.inputStream()).bufferedReader(Charsets.UTF_8).use { it.readText() }

