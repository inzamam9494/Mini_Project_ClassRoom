package com.example.classroom_mini.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class NavScreen {
    Start,
    Home,
    Assignment,
    People
}

@Composable
fun NavigationScreen(
    modifier: Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = NavScreen.Start.name,
    ) {
        composable(NavScreen.Start.name) {
            StartScreen(modifier = Modifier,
                onClickToHome = { navController.navigate(NavScreen.Home.name) })
        }
        composable(NavScreen.Home.name) {
            HomeScreen(modifier = Modifier,
                onClickToAssign = { navController.navigate(NavScreen.Assignment.name) },
                onClickToPeople = { navController.navigate(NavScreen.People.name) })
        }
        composable(NavScreen.Assignment.name) {
            AssignmentScreen(modifier = Modifier,
                onClickToHome = { navController.navigate(NavScreen.Home.name) },
                onClickToPeople = { navController.navigate(NavScreen.People.name) })
        }
        composable(NavScreen.People.name) {
            PeopleScreen(modifier = Modifier,
                onClickToHome = { navController.navigate(NavScreen.Home.name) },
                onClickToAssign = {navController.navigate(NavScreen.Assignment.name)})
        }
    }
}