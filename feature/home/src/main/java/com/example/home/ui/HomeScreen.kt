package com.example.home.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeRoute(
    onTopicClick: (String) -> Unit,
) {
    HomeScreen(onTopicClick)
}

@Composable
fun HomeScreen(
    onTopicClick: (String) -> Unit,
) {
    Text(text = "HomeScreen")
}