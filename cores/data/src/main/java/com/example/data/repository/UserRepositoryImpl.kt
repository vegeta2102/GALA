package com.example.data.repository

import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.sample
import kotlinx.coroutines.launch
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor() : UserRepository {
    @OptIn(FlowPreview::class)
    override fun get(): Flow<String> {
        return listOf(null, null, "test").asFlow().filterNotNull()
    }
}