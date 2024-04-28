package kr.co.admin

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AdminApplication : Application() {
    companion object {
        private lateinit var applicaton: AdminApplication
        fun getInstance(): AdminApplication = applicaton
    }

    override fun onCreate() {
        super.onCreate()
        applicaton = this
    }
}