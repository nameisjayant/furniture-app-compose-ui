package com.nameisjayant.furnitureapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nameisjayant.furnitureapp.R
import com.nameisjayant.furnitureapp.ui.theme.LightGray
import com.nameisjayant.furnitureapp.ui.theme.PoppinFont
import com.nameisjayant.furnitureapp.ui.theme.TextColor

@Composable
fun ProductDetailScreen() {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.product_four), contentDescription = "",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .height(250.dp)
                    .fillMaxWidth()
            )
              Card(
                  modifier = Modifier
                      .padding(top = 230.dp)
                      .fillMaxWidth(),
                  shape = RoundedCornerShape(20.dp),
                  elevation = 0.dp
              ) {
                  Text(text = "djhjjjff\nfjn\nfnjf", modifier = Modifier.padding(20.dp))
              }

        }
    }

}