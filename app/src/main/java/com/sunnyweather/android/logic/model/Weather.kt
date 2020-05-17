package com.sunnyweather.android.logic.model

/**
 * <pre>
 *     author : ganlong
 *     time   : 2020/05/17
 *     desc   :
 *     version: 1.0
 * </pre>
 */
data class Weather(val realtime: RealtimeResponse.Realtime,val daily: DailyResponse.Daily) {
}