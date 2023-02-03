package com.nameisjayant.furnitureapp.models

import androidx.annotation.DrawableRes
import com.nameisjayant.furnitureapp.R

data class Rooms(
    val id:Int,
    @DrawableRes val image:Int,
    val title:String
)

val roomList = listOf(
    Rooms(
        1,
        R.drawable.dinning_room,
        "Dining Room"
    ),
    Rooms(
        2,
        R.drawable.bed_room,
        "Bed Room"
    ),
    Rooms(
        3,
        R.drawable.dinning_room,
        "Office Room"
    ),
    Rooms(
        4,
        R.drawable.bed_room,
        "Study Room"
    )
)