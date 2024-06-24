package com.example.gala.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import androidx.tracing.trace
import com.example.data.repository.UserRepository
import com.example.data.utils.NetworkMonitor
import com.example.home.nav.navigateToHome
import com.example.news.nav.navigateToNews
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.WhileSubscribed
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

@Stable
class GalaAppState(
    val navController: NavHostController,
    private val coroutineScope: CoroutineScope,
    private val networkMonitor: NetworkMonitor,
    val userRepository: UserRepository,
) {
    val currentDestination: NavDestination?
        @Composable get() = navController.currentBackStackEntryAsState().value?.destination

    val isOffline = networkMonitor.isOnline
        .map(Boolean::not)
        .stateIn(
            scope = coroutineScope,
            started = SharingStarted.WhileSubscribed(5_000),
            initialValue = false,
        )

    val topLevelDestinations: List<TopLevelDestination> = TopLevelDestination.entries

    fun navigateToTopLevelDestination(topLevelDestination: TopLevelDestination) {
        trace("Navigation: ${topLevelDestination.name}") {
            val topLevelNavOptions = navOptions {
                // Pop up to the start destination of the graph to
                // avoid building up a large stack of destinations
                // on the back stack as users select items
                popUpTo(navController.graph.findStartDestination().id) {
                    saveState = true
                }
                // Avoid multiple copies of the same destination when
                // reselecting the same item
                launchSingleTop = true
                // Restore state when reselecting a previously selected item
                restoreState = true
            }

            when (topLevelDestination) {
                TopLevelDestination.HOME -> navController.navigateToHome(topLevelNavOptions)
                TopLevelDestination.NEW -> navController.navigateToNews(topLevelNavOptions)
                TopLevelDestination.SETTING -> navController.navigateToHome(topLevelNavOptions)
            }
        }
    }

}

@Composable
fun rememberGalaAppState(
    networkMonitor: NetworkMonitor,
    userRepository: UserRepository,
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    navController: NavHostController = rememberNavController(),
): GalaAppState {
    return remember(
        navController,
        networkMonitor,
        coroutineScope,
        userRepository
    ) {
        GalaAppState(
            navController = navController,
            networkMonitor = networkMonitor,
            userRepository = userRepository,
            coroutineScope = coroutineScope,
        )
    }
}