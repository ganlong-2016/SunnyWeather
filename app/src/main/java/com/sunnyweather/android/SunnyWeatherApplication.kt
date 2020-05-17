package com.sunnyweather.android

import android.app.Application
import android.content.Context
import kotlinx.coroutines.Dispatchers

/**
 * <pre>
 *     author : ganlong
 *     time   : 2020/05/17
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class SunnyWeatherApplication : Application() {

    companion object{
        lateinit var context: Context
        const val TOKEN = "AxDiQxCZrQYfsBoW"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}