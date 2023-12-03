package kr.peter.common.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import kr.peter.common.R
import kr.peter.common.dimen.toolbarFontSize


// 액션바에 대한 필요성은 나중에 다시 생각해보자.
@Composable
fun TitleNode(
    title: String,
    margin: PaddingValues = PaddingValues(0.dp),
    padding: PaddingValues = PaddingValues(0.dp),
    leftIconResId: Int? = null,
    rightIconResId: Int? = null,
    onLeftIconClick: (() -> Unit)? = null,
    onRightIconClick: (() -> Unit)? = null,
    isBackButtonEnable: Boolean = true,
    onBackButtonClick: (() -> Unit)? = null,
) {


    Row(
        modifier = Modifier
            .padding(margin)
            .fillMaxSize()
            .background(color = Color.White)
            .height(60.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (isBackButtonEnable) {
            Image(
                painter = painterResource(id = R.drawable.ic_common_back),
                contentDescription = "",
                modifier = Modifier
                    .wrapContentWidth()
                    .height(60.dp)
                    .clickable {
                        onBackButtonClick?.invoke()
                    }
                    .padding(PaddingValues(horizontal = 8.dp))
            )
        } else {
            Spacer(modifier = Modifier.width(40.dp))
        }
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 20.dp),
            textAlign = TextAlign.Start,
            text = title,
            fontSize = toolbarFontSize,
        )
        leftIconResId?.let { id ->
            Image(
                modifier = Modifier
                    .wrapContentWidth()
                    .fillMaxHeight()
                    .clickable {
                        onLeftIconClick?.invoke()
                    }
                    .padding(PaddingValues(horizontal = 8.dp)),
                painter = painterResource(id = id),
                contentDescription = ""
            )
        }

        rightIconResId?.let { id ->
            Image(
                modifier = Modifier
                    .wrapContentWidth()
                    .fillMaxHeight()
                    .clickable {
                        onLeftIconClick?.invoke()
                    }
                    .padding(PaddingValues(horizontal = 8.dp)),
                painter = painterResource(id = id),
                contentDescription = ""
            )
        }
    }
}


@Composable
fun TitleNode(
    titleResId: Int,
    margin: PaddingValues = PaddingValues(0.dp),
    padding: PaddingValues = PaddingValues(0.dp),
    leftIconResId: Int? = null,
    rightIconResId: Int? = null,
    onLeftIconClick: (() -> Unit)? = null,
    onRightIconClick: (() -> Unit)? = null,
    isBackButtonEnable: Boolean = true,
    onBackButtonClick: (() -> Unit)? = null,
) {
    TitleNode(
        titleResId = titleResId,
        margin = margin,
        padding = padding,
        leftIconResId = leftIconResId,
        rightIconResId = rightIconResId,
        onLeftIconClick = onLeftIconClick,
        onRightIconClick = onRightIconClick,
        isBackButtonEnable = isBackButtonEnable,
        onBackButtonClick = onBackButtonClick
    )
}