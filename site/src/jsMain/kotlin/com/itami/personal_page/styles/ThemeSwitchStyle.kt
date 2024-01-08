package com.itami.personal_page.styles

import com.itami.personal_page.theme.Theme
import com.itami.personal_page.theme.toSiteColors
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val ThemeSwitchStyle by ComponentStyle {
    val siteColors = colorMode.toSiteColors()
    base {
        Modifier
            .background(siteColors.surface)
            .padding(all = 8.px)
            .borderRadius(r = Theme.Dimensions.BORDER_RADIUS.px)
            .cursor(Cursor.Pointer)
            .border(
                width = 1.px,
                style = LineStyle.Solid,
                color = siteColors.outline
            )
            .transition(CSSTransition(property = "background", duration = 200.ms))
    }
    hover {
        Modifier.background(siteColors.outline)
    }
}