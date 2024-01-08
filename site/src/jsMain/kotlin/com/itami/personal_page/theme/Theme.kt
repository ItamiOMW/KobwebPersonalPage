package com.itami.personal_page.theme

import com.itami.personal_page.utils.Res
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.px

object Theme {

    object Dimensions {
        const val BORDER_RADIUS = 8
        const val MAX_CARD_WIDTH = 1000
        const val MAX_CARD_HEIGHT = 600
        const val ICON_SIZE_SMALL = 18
        const val ICON_SIZE_MD = 24
        const val ICON_SIZE_LG = 32
    }

    object Fonts {
        //Create desktop and mobile fonts for example...
        private val desktopFonts = SiteFonts(
            display = Font(
                fontFamily = Res.FontFamilies.POPPINS_BOLD,
                fontWeight = FontWeight.Bold,
                fontSize = 50.px,
                fontStyle = FontStyle.Normal
            ),
            bodyLarge = Font(
                fontFamily = Res.FontFamilies.POPPINS_REGULAR,
                fontWeight = FontWeight.Normal,
                fontSize = 18.px,
                fontStyle = FontStyle.Normal
            ),
            bodyMedium = Font(
                fontFamily = Res.FontFamilies.POPPINS_REGULAR,
                fontWeight = FontWeight.Normal,
                fontSize = 16.px,
                fontStyle = FontStyle.Normal
            ),
            bodySmall = Font(
                fontFamily = Res.FontFamilies.POPPINS_REGULAR,
                fontWeight = FontWeight.Normal,
                fontSize = 14.px,
                fontStyle = FontStyle.Normal
            ),
            labelLarge = Font(
                fontFamily = Res.FontFamilies.POPPINS_MEDIUM,
                fontWeight = FontWeight.Medium,
                fontSize = 18.px,
                fontStyle = FontStyle.Normal
            ),
            labelMedium = Font(
                fontFamily = Res.FontFamilies.POPPINS_MEDIUM,
                fontWeight = FontWeight.Medium,
                fontSize = 16.px,
                fontStyle = FontStyle.Normal
            ),
            labelSmall = Font(
                fontFamily = Res.FontFamilies.POPPINS_MEDIUM,
                fontWeight = FontWeight.Medium,
                fontSize = 14.px,
                fontStyle = FontStyle.Normal
            ),
        )

        operator fun get(breakpoint: Breakpoint) = when (breakpoint) {
            Breakpoint.ZERO -> {
                desktopFonts
            }

            Breakpoint.SM -> {
                desktopFonts
            }

            Breakpoint.MD -> {
                desktopFonts
            }

            Breakpoint.LG -> {
                desktopFonts
            }

            Breakpoint.XL -> {
                desktopFonts
            }
        }
    }

    object Colors {
        private val colors = mapOf(
            ColorMode.LIGHT to SiteColors(
                primary = Color.rgb(r = 33, g = 150, b = 243),
                onPrimary = Color.rgb(r = 217, g = 217, b = 217),
                surface = Color.rgb(r = 230, g = 230, b = 230),
                textPrimary = Color.rgb(r = 0, g = 0, b = 25),
                textSecondary = Color.rgb(r = 64, g = 64, b = 64),
                backgroundGradient = linearGradient(
                    dir = LinearGradient.Direction.ToRight,
                    from = Color.rgb(r = 161, g = 196, b = 253),
                    to = Color.rgb(r = 194, g = 233, b = 251)
                ),
                outline = Color.rgb(r = 210, g = 210, b = 210)
            ),
            ColorMode.DARK to SiteColors(
                primary = Color.rgb(r = 168, g = 236, b = 255),
                onPrimary = Color.rgb(r = 19, g = 38, b = 58),
                surface = Color.rgb(r = 34, g = 63, b = 94),
                textPrimary = Color.rgb(r = 230, g = 230, b = 230),
                textSecondary = Color.rgb(r = 204, g = 204, b = 204),
                backgroundGradient = linearGradient(
                    dir = LinearGradient.Direction.ToRight,
                    from = Color.rgb(r = 19, g = 38, b = 58),
                    to = Color.rgb(r = 20, g = 46, b = 73)
                ),
                outline = Color.rgb(r = 48, g = 82, b = 118)
            ),
        )

        operator fun get(colorMode: ColorMode) = colors.getValue(colorMode)
    }
}