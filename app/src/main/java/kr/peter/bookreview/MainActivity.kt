package kr.peter.bookreview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import kr.peter.bookreview.feature.edit.EditScreenRoute
import kr.peter.bookreview.feature.edit.editScreenRoute
import kr.peter.bookreview.feature.home.HomeScreenRoute
import kr.peter.bookreview.feature.home.HomeViewModel
import kr.peter.bookreview.feature.home.homeScreenRoute
import kr.peter.bookreview.ui.theme.BookReviewTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            BookReviewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    NavHost(navController = navController, startDestination = homeScreenRoute) {
                        composable(route = homeScreenRoute) {
                            HomeScreenRoute(
                                onDestinationChanged = {
                                    //navController.navigate()
                                    navController.navigate(editScreenRoute)
                                }
                            )
                        }

                        composable(route = editScreenRoute) {
                            EditScreenRoute(onDestinationChanged = {

                            })
                        }

                    }

                }

            }
        }
    }
}