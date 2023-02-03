package com.nameisjayant.furnitureapp.screens

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nameisjayant.furnitureapp.R
import com.nameisjayant.furnitureapp.commonUi.AppIconButton
import com.nameisjayant.furnitureapp.commonUi.AppIconDrawable
import com.nameisjayant.furnitureapp.commonUi.SpacerHeight
import com.nameisjayant.furnitureapp.commonUi.SpacerWidth
import com.nameisjayant.furnitureapp.ui.theme.*

@Composable
fun ProductDetailScreen() {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.product_four),
                contentDescription = "",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .height(250.dp)
                    .fillMaxWidth()
            )
            HeaderIcon()
            Card(
                modifier = Modifier
                    .padding(top = 230.dp)
                    .fillMaxSize(),
                shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
            ) {
                LazyColumn {
                    item {
                        ProductHeaderSection()
                    }
                    item {
                        RatingSection()
                    }
                }
            }

        }
    }

}

@Composable
fun ProductHeaderSection() {
    var count by remember { mutableStateOf("0") }
    Column(
        modifier = Modifier.padding(20.dp)
    ) {
        Text(
            text = stringResource(R.string.product_name), style = TextStyle(
                color = TextColor,
                fontWeight = FontWeight.W400,
                fontSize = 20.sp,
            )
        )
        SpacerHeight(10.dp)
        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "$599", style = TextStyle(
                    fontSize = 20.sp, fontWeight = FontWeight.W600, color = DarkOrange
                )
            )
            Row(
            ) {
                ProductCount(icon = Icons.Default.Minimize) {
                    if (count != "0") count = count.toInt().minus(1).toString()
                }
                Text(
                    text = count, style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.W400,
                        color = TextColor,
                    ), modifier = Modifier
                        .align(CenterVertically)
                        .padding(horizontal = 15.dp)
                )
                ProductCount(icon = Icons.Default.Add) {
                    count = count.toInt().plus(1).toString()
                }
            }
        }
    }
}

@Composable
fun RatingSection() {

    val personIcons =
        listOf(R.drawable.person_1, R.drawable.person_2, R.drawable.person_3, R.drawable.person_4)

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Background)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column() {
                Row {
                    Row {
                        (0..4).forEach {
                            Icon(
                                Icons.Default.StarRate,
                                contentDescription = "",
                                tint = Yellow,
                            )
                        }
                    }
                    SpacerWidth(10.dp)
                    Text(
                        text = "5.0", style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            color = TextColor
                        ),
                        modifier = Modifier.align(CenterVertically)
                    )
                }
                Row(
                    modifier = Modifier.padding(top = 10.dp)
                ) {
                    Text(
                        text = "98 Reviews", style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            color = LightGray
                        ),
                        modifier = Modifier.align(CenterVertically)
                    )
                    SpacerWidth()
                    Icon(
                        Icons.Default.KeyboardArrowRight,
                        contentDescription = "",
                        tint = LightGray
                    )
                }
            }
            Row(
                modifier = Modifier.align(CenterVertically)
            ) {
                personIcons.forEachIndexed { index, i ->
                    Log.d("main", "RatingSection: $index ")
                    AppIconDrawable(
                        icon = i,
                        modifier = Modifier
                            .size(32.dp)
                            .offset(
                                x = if (index > 0) -(10.dp) else 0.dp, y = 0.dp
                            ),
                    )
                }

            }
        }
    }
}

@Composable
fun ProductCount(
    icon: ImageVector, modifier: Modifier = Modifier, onClick: () -> Unit = {}
) {
    TextButton(
        onClick = { onClick() },
        modifier = modifier.size(24.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = ButtonDefaults.elevation(0.dp),
        border = BorderStroke(2.dp, DarkOrange)
    ) {
        Icon(icon, contentDescription = "", tint = DarkOrange)
    }
}

@Composable
fun HeaderIcon() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp, vertical = 50.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        AppIconButton(icon = R.drawable.back)
        AppIconButton(icon = R.drawable.share)
    }

}


