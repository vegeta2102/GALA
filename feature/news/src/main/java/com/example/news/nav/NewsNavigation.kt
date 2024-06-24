package com.example.news.nav

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.news.ui.NewsRoute

const val NEWS_ROUTE = "new_route"
fun NavController.navigateToNews(navOptions: NavOptions) = navigate(NEWS_ROUTE, navOptions)
fun NavGraphBuilder.newsScreen(onTopicClick: (String) -> Unit) {
    composable(
        route = NEWS_ROUTE,
        deepLinks = emptyList(),
        arguments = emptyList(),
    ) {
        NewsRoute()
    }
}