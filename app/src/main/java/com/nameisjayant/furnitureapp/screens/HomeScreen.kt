package com.nameisjayant.furnitureapp.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nameisjayant.furnitureapp.R
import com.nameisjayant.furnitureapp.commonUi.SpacerWidth
import com.nameisjayant.furnitureapp.ui.theme.DarkOrange
import com.nameisjayant.furnitureapp.ui.theme.LightGray
import com.nameisjayant.furnitureapp.ui.theme.PoppinFont
import com.nameisjayant.furnitureapp.ui.theme.TextColor


@Composable
fun HomeScreen() {
    var search by remember { mutableStateOf("") }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Column {
            HomeHeader()
            CustomSearchView(text = search) {
                search = it
            }
            CategoryRow()
        }

    }
}

@Composable
fun CategoryRow() {

    Column() {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(
                text = stringResource(R.string.categories), style = TextStyle(
                    color = TextColor,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W600,
                    fontFamily = PoppinFont,
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier.align(CenterVertically)
            )
            TextButton(onClick = { }) {
                Text(
                    text = stringResource(R.string.see_all), style = TextStyle(
                        color = DarkOrange,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.W400,
                        fontFamily = PoppinFont,
                        textAlign = TextAlign.Center
                    )
                )
                SpacerWidth(3.dp)
                Icon(Icons.Default.ArrowForward, contentDescription = "", tint = DarkOrange)
            }
        }
    }

}

@Composable
fun CustomSearchView(
    text: String, onValueChange: (String) -> Unit
) {
    Card(
        elevation = 0.dp,
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 20.dp),
        border = BorderStroke(1.dp, LightGray)
    ) {
        TextField(value = text,
            onValueChange = { onValueChange(it) },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.Transparent,
                textColor = TextColor,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text = stringResource(R.string.placeholder), style = TextStyle(
                        color = LightGray,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.W400,
                        fontFamily = PoppinFont,
                        textAlign = TextAlign.Center
                    )
                )
            },
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = "", tint = LightGray) })
    }
}

@Composable
fun HomeHeader(
    onClick: () -> Unit = {}
) {

    Row(
        modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = stringResource(R.string.heading_text), style = TextStyle(
                color = TextColor,
                fontSize = 24.sp,
                fontWeight = FontWeight.W600,
                fontFamily = PoppinFont
            )
        )
        IconButton(
            onClick = { onClick() }, modifier = Modifier
                .size(32.dp)
                .align(CenterVertically)
        ) {
            Icon(
                Icons.Default.Notifications, contentDescription = "", tint = DarkOrange
            )
        }
    }

}