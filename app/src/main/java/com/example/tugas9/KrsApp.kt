package com.example.tugas9

import android.app.Application
import com.example.tugas9.dependenciesinjection.ContainerApp
import com.example.tugas9.dependenciesinjection.InterfaceContainerApp

class KrsApp : Application() {
    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this)
    }

}
