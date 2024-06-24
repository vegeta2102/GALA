package com.example.home.nav

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink
import com.example.home.ui.HomeRoute

// const val LINKED_NEWS_RESOURCE_ID = "GALA"
// const val HOME_ROUTE = "home_route/{$LINKED_NEWS_RESOURCE_ID}"
const val HOME_ROUTE = "home_route"
// private const val DEEP_LINK_URI_PATTERN = "https://www.com.example/home/{$LINKED_NEWS_RESOURCE_ID}"
fun NavController.navigateToHome(navOptions: NavOptions) = navigate(HOME_ROUTE, navOptions)
/*
fun NavGraphBuilder.homeScreen(onTopicClick: (String) -> Unit) {
    composable(
        route = HOME_ROUTE,
        deepLinks = listOf(
            navDeepLink { uriPattern = DEEP_LINK_URI_PATTERN },
        ),
        arguments = listOf(
            navArgument(LINKED_NEWS_RESOURCE_ID) { type = NavType.StringType },
        ),
    ) {
        HomeRoute(onTopicClick)
    }
}*/
fun NavGraphBuilder.homeScreen(onTopicClick: (String) -> Unit) {
    composable(
        route = HOME_ROUTE,
        deepLinks = emptyList(),
        arguments = emptyList(),
    ) {
        HomeRoute(onTopicClick)
    }
}
