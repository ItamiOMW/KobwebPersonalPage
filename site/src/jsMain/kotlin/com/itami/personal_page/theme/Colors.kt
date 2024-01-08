package com.itami.personal_page.theme

import com.varabyte.kobweb.compose.css.functions.Gradient
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.silk.theme.colors.ColorMode

class SiteColors(
    val primary: Color,
    val onPrimary: Color,
    val surface: Color,
    val textPrimary: Color,
    val textSecondary: Color,
    val backgroundGradient: Gradient,
    val outline: Color,
)

fun ColorMode.toSiteColors() = Theme.Colors[this]