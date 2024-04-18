package com.zenith.group2_finalproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.zenith.group2_finalproject.views.HomePage
import com.zenith.group2_finalproject.views.IntroPage

@Composable

fun NavRoutes(navController: NavHostController){
    NavHost(navController = navController, startDestination = Routes.IntroPage.route){
        composable(route = Routes.IntroPage.route){
            IntroPage(navController = navController)
        }
        composable(route = Routes.HomePage.route){
            HomePage(navController = navController)
        }
    }
}