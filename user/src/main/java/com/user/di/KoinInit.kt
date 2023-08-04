package com.user.di

import android.content.Context
import androidx.startup.Initializer
import com.user.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.Koin
import org.koin.dsl.koinApplication

internal class KoinInit : Initializer<Koin> {
    override fun create(context: Context): Koin {
        return koinApplication {
            androidContext(context)
            modules( listOf( userModules))
        }.koin
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}