package com.itami.personal_page.styles

import com.itami.personal_page.theme.Theme
import com.itami.personal_page.theme.toSiteColors
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val SocialIconButtonStyle by ComponentStyle {
    val siteColors = colorMode.toSiteColors()
    base {
        Modifier
            .background(Colors.Transparent)
            .transition(
                CSSTransition(property = "background", duration = 200.ms),
                CSSTransition(property = "rotation", duration = 200.ms)
            )
            .padding(all = 8.px)
            .borderRadius(r = Theme.Dimensions.BORDER_RADIUS.px)
            .cursor(Cursor.Pointer)
            .border(
                width = 1.px,
                style = LineStyle.Solid,
                color = siteColors.outline
            )
    }
    hover {
        Modifier.background(siteColors.outline)
    }
}