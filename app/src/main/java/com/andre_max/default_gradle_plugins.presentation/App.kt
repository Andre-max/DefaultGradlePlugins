package com.andre_max.deafault_gradkle_plugins.presentation.App

import android.app.Application
import com.andre_max.tiktokclone.BuildConfig
import com.google.firebase.crashlytics.FirebaseCrashlytics

class App(): Application() {
    override fun onCreate() {
        super.onCreate()
        val isDebug = BuildConfig.DEBUG
        if (isDebug) Timber.plant(Timber.DebugTree())
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(!isDebug)
    }
}