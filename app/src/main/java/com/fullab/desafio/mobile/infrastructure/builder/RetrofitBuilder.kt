package com.fullab.desafio.mobile.infrastructure.builder

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitBuilder {

    private const val TIME_OUT: Long = 2
    private const val BASE_URL: String = "https://desafio.mobfiq.com.br/"

    fun buildRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(buildClient())
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    private fun buildClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .readTimeout(TIME_OUT, TimeUnit.MINUTES)
            .writeTimeout(TIME_OUT, TimeUnit.MINUTES)
            .connectTimeout(TIME_OUT, TimeUnit.MINUTES)
            .build()
    }
}