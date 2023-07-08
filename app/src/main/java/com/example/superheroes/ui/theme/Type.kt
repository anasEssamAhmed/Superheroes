package com.example.superheroes.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.superheroes.R

val cabin = FontFamily(
    Font(R.font.cabin_bold , FontWeight.Bold),
    Font(R.font.cabin_regular , FontWeight.Normal)
)

val typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = cabin,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    displayLarge = TextStyle(
        fontFamily = cabin,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp
    ),
    displayMedium = TextStyle(
        fontFamily = cabin,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    displaySmall = TextStyle(
        fontFamily = cabin,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )
)


