package com.nameisjayant.furnitureapp.commonUi

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nameisjayant.furnitureapp.ui.theme.TextColor


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
fun AppIconButtonDrawable(
    @DrawableRes icon: Int,
    tint: Color = Color.Unspecified,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    IconButton(onClick = { onClick() }, modifier = modifier.size(32.dp)) {
        Icon(painter = painterResource(id = icon), contentDescription = "", tint = tint)
    }
}

@SuppressLint("ModifierParameter")
@Composable
fun AppIconButton(
    icon: ImageVector,
    tint: Color = Color.Unspecified,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    IconButton(onClick = { onClick() }, modifier = modifier.size(32.dp)) {
        Icon(imageVector = icon, contentDescription = "", tint = tint)
    }
}


@SuppressLint("ModifierParameter")
@Composable
fun AppIcon(
    icon: ImageVector,
    tint: Color = Color.Unspecified,
    modifier: Modifier = Modifier,
) {
    Icon(icon, contentDescription = "", tint = tint, modifier = modifier)
}

@SuppressLint("ModifierParameter")
@Composable
fun AppIconDrawable(
    @DrawableRes icon: Int,
    tint: Color = Color.Unspecified,
    modifier: Modifier = Modifier,
) {
    Icon(
        painter = painterResource(id = icon),
        contentDescription = "",
        tint = tint,
        modifier = modifier
    )
}
@SuppressLint("ModifierParameter")
@Composable
fun AppButton(
    title: String,
    textColor: Color = Color.White,
    background: Color = TextColor,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = { onClick() },
        shape = RoundedCornerShape(10.dp),
        elevation = ButtonDefaults.elevation(0.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = background
        ),
        modifier = modifier
            .height(40.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = title, style = TextStyle(
                fontSize = 14.sp,
                color = textColor,
                fontWeight = FontWeight.W600
            )
        )
    }
}