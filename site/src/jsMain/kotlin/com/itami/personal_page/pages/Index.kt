package com.itami.personal_page.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.itami.personal_page.components.layouts.ProfileCard
import com.itami.personal_page.components.widgets.IconButton
import com.itami.personal_page.styles.ThemeSwitchStyle
import com.itami.personal_page.theme.toSiteColors
import com.itami.personal_page.theme.toSiteFonts
import com.itami.personal_page.utils.Res
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.px

@Page
@Composable
fun HomePage() {
    var colorMode by ColorMode.currentState
    val breakpoint = rememberBreakpoint()
    val siteColors = colorMode.toSiteColors()
    val siteFonts = breakpoint.toSiteFonts()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .backgroundImage(siteColors.backgroundGradient),
        contentAlignment = Alignment.Center
    ) {
        ProfileCard(
            colorMode = colorMode,
            breakpoint = breakpoint,
            siteColors = siteColors,
            siteFonts = siteFonts
        )
        IconButton(
            modifier = ThemeSwitchStyle.toModifier()
                .margin(all = if (breakpoint > Breakpoint.SM) 24.px else 16.px)
                .styleModifier {
                    property("pointer-events", "auto")
                }
                .align(Alignment.TopEnd),
            iconRes = if (colorMode.isLight) Res.Icons.SUN else Res.Icons.MOON,
            onClick = {
                colorMode = colorMode.opposite
            }
        )
    }
}
