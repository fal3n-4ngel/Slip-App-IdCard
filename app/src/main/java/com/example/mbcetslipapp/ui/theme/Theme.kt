package com.example.mbcetslipapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    background = Grey10,
    onBackground = Grey1,
    primary = PrimDark,
    primaryVariant = Grey4,
    secondary = Grey1,
    surface = PrimDark,

)

private val LightColorPalette = lightColors(
    background = Grey2,
    onBackground = PrimDark,
    primary = PrimBlue,
    primaryVariant = Grey10,
    secondary = SecGrey1,
    onSecondary = Color.Black,
    onSurface = Grey2
)

@Composable
fun MBCETSlipAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}