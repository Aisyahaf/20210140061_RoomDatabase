package com.example.project7_classc

import android.app.Application
import com.example.project7_classc.repositori.ContainerApp
import com.example.project7_classc.repositori.ContainerDataApp

class AplikasiSiswa : Application() {

    lateinit var container: ContainerApp

    override fun onCreate(){
        super.onCreate()
        container = ContainerDataApp(this)
    }
}