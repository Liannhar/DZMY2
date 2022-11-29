package com.example.dzmy2

import android.app.Application
import com.example.homework_2.utils.Connector

class MainApplication : Application()
{
    override fun onCreate()
    {
        super.onCreate()
        Connector.initialize(this)
    }

}