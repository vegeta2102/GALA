package com.example.gala.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.example.gala.ui.GalaAppState
import com.example.home.nav.HOME_ROUTE
import com.example.home.nav.homeScreen
import com.example.news.nav.newsScreen

@Composable
fun GalaNavHost(
    appState: GalaAppState,
    onShowSnackbar: suspend (String, String?) -> Boolean,
    modifier: Modifier = Modifier,
    startDestination: String = HOME_ROUTE,
) {

    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        homeScreen {
            // Do nothing
        }
        newsScreen {

        }

    }
}