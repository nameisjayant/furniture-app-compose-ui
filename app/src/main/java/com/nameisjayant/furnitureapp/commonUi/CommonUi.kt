package com.nameisjayant.furnitureapp.commonUi

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun SpacerHeight(height: Dp = 5.dp) {
    Spacer(modifier = Modifier.height(height))
}

@Composable
fun SpacerWidth(width: Dp = 5.dp) {
    Spacer(modifier = Modifier.width(width))
}
@SuppressLint("ModifierParameter")
@Composable
fun AppIconButton(
    @DrawableRes icon:Int,
    tint:Color = Color.Unspecified,
    modifier: Modifier = Modifier,
    onClick:()->Unit ={}
) {
    IconButton(onClick = {onClick()}, modifier = modifier.size(32.dp)) {
       Icon(painter = painterResource(id = icon), contentDescription = "", tint = tint)
    }
}