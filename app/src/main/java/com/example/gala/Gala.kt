package com.example.gala

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class Gala : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.d("Gala is started")
    }
}