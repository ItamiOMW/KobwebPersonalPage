package com.itami.personal_page.styles

import com.itami.personal_page.theme.Theme
import com.itami.personal_page.theme.toSiteColors
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import org.jetbrains.compose.web.css.px

val ProfileCardStyle by ComponentStyle {
    val siteColors = colorMode.toSiteColors()
    base {
        Modifier
            .boxShadow(
                color = Colors.Black.copy(alpha = 10),
                blurRadius = 50.px,
                spreadRadius = 50.px
            )
            .padding(all = 12.px)
            .borderRadius(r = Theme.Dimensions.BORDER_RADIUS.px)
            .background(color = siteColors.surface)
    }
}