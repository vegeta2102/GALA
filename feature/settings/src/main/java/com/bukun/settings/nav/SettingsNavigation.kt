package com.bukun.settings.nav

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.bukun.settings.ui.SettingsRoute
import com.bukun.settings.ui.SettingsScreen

const val SETTINGS_ROUTE = "settings_route"
fun NavController.navigateToSettings(navOptions: NavOptions) = navigate(SETTINGS_ROUTE, navOptions)
fun NavGraphBuilder.settingsScreen(onTopicClick: (String) -> Unit) {
    composable(
        route = SETTINGS_ROUTE,
        deepLinks = emptyList(),
        arguments = emptyList(),
    ) {
        SettingsRoute()
    }
}