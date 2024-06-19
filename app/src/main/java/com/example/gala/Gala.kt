package com.example.gala

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class Gala : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}