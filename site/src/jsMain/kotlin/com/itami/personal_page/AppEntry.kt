package com.itami.personal_page

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.itami.personal_page.theme.Font
import com.itami.personal_page.theme.SiteFonts
import com.itami.personal_page.theme.Theme
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.MutableSilkTheme
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.palette.button
import kotlinx.browser.localStorage
import org.jetbrains.compose.web.css.vh

const val COLOR_MODE_KEY = "itamimobile:app:colorMode"

@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    SilkApp {
        val colorMode = ColorMode.current
        LaunchedEffect(colorMode) {
            localStorage.setItem(COLOR_MODE_KEY, colorMode.name)
        }

        Surface(SmoothColorStyle.toModifier().minHeight(100.vh)) {
            content()
        }
    }
}

@InitSilk
fun overrideSilkTheme(ctx: InitSilkContext) {
    ctx.apply {
        theme.apply {
            palettes.light.apply {
                val lightColors = Theme.Colors[ColorMode.LIGHT]
                button.set(
                    default = lightColors.primary,
                    hover = lightColors.primary,
                    focus = lightColors.primary,
                    pressed = lightColors.primary,
                )
            }

            palettes.dark.apply {
                val darkColors = Theme.Colors[ColorMode.DARK]
                button.set(
                    default = darkColors.primary,
                    hover = darkColors.primary,
                    focus = darkColors.primary,
                    pressed = darkColors.primary,
                )
            }
        }
    }
}