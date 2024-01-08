package com.itami.personal_page.styles

import com.itami.personal_page.theme.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.focus
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val ButtonStyle by ComponentStyle {
    val siteColors = Theme.Colors[colorMode]
    base {
        Modifier
            .backgroundColor(siteColors.primary)
            .color(siteColors.onPrimary)
            .padding(leftRight = 12.px)
            .transition(CSSTransition(property = TransitionProperty.All, duration = 200.ms))
    }
    hover {
        Modifier
            .backgroundColor(siteColors.primary)
            .color(siteColors.onPrimary)
            .padding(leftRight = 20.px)
    }
}