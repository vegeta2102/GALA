/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.gala.ui

import androidx.compose.ui.graphics.vector.ImageVector
import com.example.component.GalaIcons
import com.example.home.R as homeR
import com.example.news.R as newsR
import com.example.settings.R as settingR

/**
 * Type for the top level destinations in the application. Each of these destinations
 * can contain one or more screens (based on the window size). Navigation from one screen to the
 * next within a single destination will be handled directly in composables.
 */
enum class TopLevelDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int,
    val titleTextId: Int,
) {
    HOME(
        selectedIcon = GalaIcons.Home,
        unselectedIcon = GalaIcons.HomeBorder,
        iconTextId = homeR.string.tab_home,
        titleTextId = homeR.string.tab_home,
    ),
    NEW(
        selectedIcon = GalaIcons.News,
        unselectedIcon = GalaIcons.NewsBorder,
        iconTextId = newsR.string.tab_news,
        titleTextId = newsR.string.tab_news,
    ),
    SETTING(
        selectedIcon = GalaIcons.Settings,
        unselectedIcon = GalaIcons.SettingsBorder,
        iconTextId = settingR.string.tab_setting,
        titleTextId = settingR.string.tab_setting,
    ),
}
