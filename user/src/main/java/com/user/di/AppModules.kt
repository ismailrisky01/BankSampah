package com.user.di



import com.user.data.remote.api.ApiService
import com.user.domain.repository.UserRepository
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val userModules = module {
    single { ApiService.getService() }
    factory <UserRepository> { UserRepository(get()) }

}

