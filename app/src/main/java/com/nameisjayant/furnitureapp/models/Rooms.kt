package com.nameisjayant.furnitureapp.models

import androidx.annotation.DrawableRes

data class Rooms(
    val id:Int,
    @DrawableRes val image:Int,
    val title:String
)
