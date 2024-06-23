package com.example.data.di

import com.example.data.repository.UserRepository
import com.example.data.repository.UserRepositoryImpl
import com.example.data.utils.ConnectivityNetworkManager
import com.example.data.utils.NetworkMonitor
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    internal abstract fun bindsUserRepository(
        userRepository: UserRepositoryImpl
    ): UserRepository

    @Binds
    internal abstract fun bindsNetworkMonitor(
        networkMonitor: ConnectivityNetworkManager
    ): NetworkMonitor
}