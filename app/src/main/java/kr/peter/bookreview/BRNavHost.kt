package kr.peter.bookreview

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kr.peter.common.G.UiRoute.editScreenRoute
import kr.peter.common.G.UiRoute.homeScreenRoute
import kr.peter.edit.EditScreenRoute
import kr.peter.home.HomeScreenRoute


@Composable
fun BRNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = homeScreenRoute) {
        composable(route = homeScreenRoute) {
            HomeScreenRoute(
                onDestinationChanged = {
                    navController.navigate(it)
                }
            )
        }

        composable(route = editScreenRoute) {
            EditScreenRoute(onDestinationChanged = {

            })
        }

    }
}

