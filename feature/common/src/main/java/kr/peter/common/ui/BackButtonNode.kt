package kr.peter.common.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.peter.common.R


@Composable
fun BackButtonNode(
    onBackClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .wrapContentSize()

            .background(
                color = Color.White,
                shape = CircleShape
            )
            .padding(
                all = 8.dp
            )
    ) {
        Image(painter = painterResource(id = R.drawable.ic_common_back), contentDescription = "")
    }
}

@Composable
@Preview
private fun BackButtonNodePreview() {

    MaterialTheme {
        BackButtonNode {

        }
    }
}