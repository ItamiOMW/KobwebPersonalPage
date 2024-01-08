package com.itami.personal_page.theme

import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.fontSize

class Font(
    val fontFamily: String,
    val fontWeight: FontWeight,
    val fontSize: CSSSizeValue<CSSUnit.px>,
    val fontStyle: FontStyle
)

class SiteFonts(
    val display: Font,
    val bodyLarge: Font,
    val bodyMedium: Font,
    val bodySmall: Font,
    val labelLarge: Font,
    val labelMedium: Font,
    val labelSmall: Font
)

fun Breakpoint.toSiteFonts() = Theme.Fonts[this]

fun Modifier.font(font: Font): Modifier = styleModifier {
    fontFamily(font.fontFamily)
    fontSize(font.fontSize)
    fontStyle(font.fontStyle)
    fontWeight(font.fontWeight)
}