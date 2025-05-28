package com.example.solidprinciples.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.solidprinciples.MainScreenComposable


@Composable
fun NavGraphComposable(navHostController: NavHostController, innerPadding: PaddingValues){


    NavHost(navController = navHostController, startDestination = MainScreen){

        composable<MainScreen> {
            MainScreenComposable()
        }

    }

}