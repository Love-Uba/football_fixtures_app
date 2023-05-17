package com.loveuba.tryoneapplication

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

object UtilConstants {

    const val BASE_URL = "http://api.football-data.org/"
}

fun getTimeDifference(dateString: String): String {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US)
    dateFormat.timeZone = TimeZone.getTimeZone("UTC")

    val currentDate = Date()
    val providedDate = dateFormat.parse(dateString)

    val differenceInMillis = currentDate.time - providedDate.time
    val minutes = differenceInMillis / (1000 * 60)
    val seconds = (differenceInMillis / 1000) % 60

    return "$minutes:$seconds"
}