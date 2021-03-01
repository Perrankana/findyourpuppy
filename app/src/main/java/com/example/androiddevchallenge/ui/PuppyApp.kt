/*
 * Copyright 2021 The Android Open Source Project
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
package com.example.androiddevchallenge.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.puppies
import com.example.androiddevchallenge.ui.Destinations.PuppyDetail
import com.example.androiddevchallenge.ui.Destinations.PuppyDetailArgs.PuppyId
import com.example.androiddevchallenge.ui.grid.PuppyGrid
import com.example.androiddevchallenge.ui.puppy.PuppyDetail
import com.example.androiddevchallenge.viewmodel.toListItem

@Composable
fun MyApp() {
    Surface(color = MaterialTheme.colors.background) {
        val navController = rememberNavController()
        val actions = remember(navController) { Actions(navController) }
        NavHost(navController = navController, startDestination = "Home") {
            composable("Home") {
                PuppyGrid(puppies = puppies.map { it.toListItem() }) { puppyId ->
                    actions.openPuppyDetail(puppyId)
                }
            }
            composable(
                "$PuppyDetail/{$PuppyId}",
                arguments = listOf(navArgument(PuppyId) { type = NavType.IntType })
            ) { backStackEntry ->
                PuppyDetail(
                    puppy = puppies[backStackEntry.arguments?.getInt(PuppyId) ?: 0]
                ) {
                    actions.navigateUp()
                }
            }
        }
    }
}
