package com.example.homework_2.utils

import android.content.Context
import com.example.dzmy2.R
import com.example.homework_2.data.api.ImageProvider
import com.example.homework_2.data.api.ItemRequest


object Connector
{
    private lateinit var request : ItemRequest

    fun initialize(context: Context)
    {
       request = ItemRequest.createRequest(context.applicationContext.getString(R.string.base_url))
    }

    fun provider(): ImageProvider = ImageProvider(request)
}