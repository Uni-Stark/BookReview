package kr.peter.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import kr.peter.common.G


@Composable
fun HomeScreenRoute(
    onDestinationChanged: (String) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel()
) {
    HomeScreen(
        onDestinationChanged = onDestinationChanged
    )
}

@Composable
fun HomeScreen(
    onDestinationChanged: (String) -> Unit,
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red),
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            contentAlignment = Alignment.BottomCenter
        ) {
            Button(
                modifier = Modifier,
                onClick = {
                    onDestinationChanged(G.UiRoute.editScreenRoute)
                }
            ) {
                Text(
                    text = "버튼을 누르세요!",
                    modifier = Modifier.background(color = Color.White)
                )
            }
        }

    }
}