package com.itami.personal_page.components.widgets

import androidx.compose.runtime.Composable
import com.itami.personal_page.theme.Theme
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.px

@Composable
fun IconButton(
    modifier: Modifier = Modifier,
    iconRes: String,
    iconSize: CSSSizeValue<CSSUnit.px> = Theme.Dimensions.ICON_SIZE_MD.px,
    onClick: (() -> Unit)? = null,
) {
    Box(
        modifier = modifier.onClick { onClick?.invoke() },
        contentAlignment = Alignment.Center
    ) {
        Image(
            src = iconRes,
            modifier = Modifier.size(iconSize),
        )
    }
}

@Composable
fun LinkedIconButton(
    modifier: Modifier = Modifier,
    iconRes: String,
    link: String,
    iconSize: CSSSizeValue<CSSUnit.px> = Theme.Dimensions.ICON_SIZE_MD.px,
    onClick: (() -> Unit)? = null,
) {
    Link(path = link) {
        IconButton(
            modifier = modifier,
            iconRes = iconRes,
            iconSize = iconSize,
            onClick = onClick
        )
    }
}