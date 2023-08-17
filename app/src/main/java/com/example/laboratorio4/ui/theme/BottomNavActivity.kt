
package com.example.laboratorio4.ui.theme

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.laboratorio4.pages.HomeScreen
import com.example.laboratorio4.pages.MyProfileScreen
import com.example.laboratorio4.pages.SettingsScreen
import androidx.compose.material.*
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.laboratorio4.R
import androidx.compose.ui.res.painterResource
import com.example.laboratorio4.pages.EmergencyScreen


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BottomNavigation() {
    val navController: NavHostController= rememberNavController()

    Scaffold(
        bottomBar = {
            val items = listOf(
                BottomNavItem.Home,
                BottomNavItem.MyProfile,
                BottomNavItem.Settings,
                BottomNavItem.Emergency
            )
            BottomNavigation(
                backgroundColor = colorResource(id = R.color.green),
                contentColor = Color.White
            ){
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route
                items.forEach { item ->
                    BottomNavigationItem(
                        icon = {
                            Icon(
                                painterResource(id = item.icon),
                                contentDescription = item.title
                            )
                        },
                        label = {
                            Text(
                                text = item.title,
                                fontSize = 9.sp
                            )
                        },
                        selectedContentColor = Color.White,
                        unselectedContentColor = Color.White.copy(0.4f),
                        alwaysShowLabel = true,
                        selected = currentRoute == item.screen_route,
                        onClick = {
                            navController.navigate(item.screen_route) {

                                navController.graph.startDestinationRoute?.let { screen_route ->
                                    popUpTo(screen_route) {
                                        saveState = true
                                    }
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }

        }
    ){
        NavigationGraph(navController = navController)
    }

}

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.Home.screen_route) {
        composable(BottomNavItem.Home.screen_route) {
            HomeScreen()
        }
        composable(BottomNavItem.MyProfile.screen_route) {
            MyProfileScreen()
        }
        composable(BottomNavItem.Settings.screen_route) {
            SettingsScreen()
        }

        composable(BottomNavItem.Emergency.screen_route) {
            EmergencyScreen()
        }
    }
}
