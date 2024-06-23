package com.example.data.repository

import kotlinx.coroutines.flow.Flow

interface UserRepository {
    fun get(): Flow<String>
}