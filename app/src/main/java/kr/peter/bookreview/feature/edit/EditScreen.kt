package kr.peter.bookreview.feature.edit

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel

const val editScreenRoute: String = "Edit"

@Composable
fun EditScreenRoute(
    onDestinationChanged: (String) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: EditViewModel = viewModel()
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue)
    ) {

    }
}