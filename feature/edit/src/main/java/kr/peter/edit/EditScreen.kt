package kr.peter.edit

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import kr.peter.common.ui.TitleNode



@Composable
fun EditScreenRoute(
    onDestinationChanged: (String) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: EditViewModel = viewModel()
) {
    EditScreen()
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun EditScreen() {

    LazyColumn {
        stickyHeader {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .background(color = Color.White),
            ) {
                kr.peter.common.ui.TitleNode(title = "작성하기")
            }
        }
    }


}

@Composable
private fun TitleBox() {

}