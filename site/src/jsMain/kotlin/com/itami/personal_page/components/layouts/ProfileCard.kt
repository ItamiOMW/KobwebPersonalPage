package com.itami.personal_page.components.layouts

import androidx.compose.runtime.Composable
import com.itami.personal_page.components.widgets.IconButton
import com.itami.personal_page.components.widgets.LinkedIconButton
import com.itami.personal_page.styles.ButtonStyle
import com.itami.personal_page.styles.ProfileCardStyle
import com.itami.personal_page.styles.SocialIconButtonStyle
import com.itami.personal_page.theme.SiteColors
import com.itami.personal_page.theme.SiteFonts
import com.itami.personal_page.theme.Theme
import com.itami.personal_page.theme.font
import com.itami.personal_page.utils.Res
import com.itami.personal_page.utils.SocialIcon
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.window
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun ProfileCard(
    colorMode: ColorMode = ColorMode.current,
    breakpoint: Breakpoint = Breakpoint.MD,
    siteColors: SiteColors = Theme.Colors[colorMode],
    siteFonts: SiteFonts = Theme.Fonts[breakpoint],
) {
    SimpleGrid(
        numColumns = numColumns(base = 1, sm = 2),
        modifier = ProfileCardStyle.toModifier()
            .fillMaxWidth(
                if (breakpoint <= Breakpoint.MD) 100.percent
                else Theme.Dimensions.MAX_CARD_WIDTH.px
            )
            .thenIf(
                condition = breakpoint > Breakpoint.MD,
                other = Modifier.height(Theme.Dimensions.MAX_CARD_HEIGHT.px)
            )
    ) {
        TextSide(
            breakpoint = breakpoint,
            siteColors = siteColors,
            siteFonts = siteFonts,
            colorMode = colorMode
        )
        ProfilePhotoSide(breakpoint = breakpoint)
    }
}

@Composable
private fun TextSide(
    colorMode: ColorMode,
    breakpoint: Breakpoint,
    siteColors: SiteColors,
    siteFonts: SiteFonts,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 50.px),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally else Alignment.Start
    ) {
        SpanText(
            text = Res.Strings.NAME,
            modifier = Modifier
                .font(siteFonts.display)
                .color(siteColors.textPrimary)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )
        SpanText(
            text = Res.Strings.PROFESSION,
            modifier = Modifier
                .margin(bottom = 24.px)
                .font(siteFonts.bodyLarge)
                .color(siteColors.textPrimary)
        )
        Surface(
            modifier = Modifier
                .height(4.px)
                .width(40.px)
                .margin(bottom = 24.px)
                .background(siteColors.primary)
                .align(
                    if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally
                    else Alignment.Start
                )
        ) {}
        SpanText(
            text = Res.Strings.ABOUT,
            modifier = Modifier
                .font(siteFonts.bodySmall)
                .margin(14.px)
                .margin(bottom = 36.px)
                .color(siteColors.textSecondary)
                .lineHeight(2)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )
        Button(
            modifier = ButtonStyle.toModifier()
                .margin(bottom = 50.px),
            size = ButtonSize.LG,
            onClick = { window.location.href = Res.Strings.HREF_EMAIL }
        ) {
            IconButton(
                modifier = Modifier.margin(right = 12.px),
                iconRes = if (colorMode.isLight) Res.Icons.MAIL_ON_PRIMARY_LIGHT
                else Res.Icons.MAIL_ON_PRIMARY_DARK,
                iconSize = Theme.Dimensions.ICON_SIZE_SMALL.px
            )
            SpanText(
                text = Res.Strings.CONTACT_BUTTON_TEXT,
                modifier = Modifier
                    .font(siteFonts.labelSmall)
                    .color(siteColors.onPrimary)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .gap(12.px),
            horizontalArrangement = if (breakpoint <= Breakpoint.SM) Arrangement.Center else Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            SocialIcon.entries.forEach { socialIcon ->
                LinkedIconButton(
                    modifier = SocialIconButtonStyle.toModifier(),
                    iconRes = if (colorMode.isLight) socialIcon.iconResLight else socialIcon.iconResDark,
                    link = socialIcon.link,
                )
            }
        }
    }
}

@Composable
private fun ProfilePhotoSide(breakpoint: Breakpoint) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .thenIf(
                condition = breakpoint > Breakpoint.MD,
                other = Modifier.height((Theme.Dimensions.MAX_CARD_HEIGHT - 24).px)
            )
    ) {
        Image(
            modifier = Modifier
                .borderRadius(r = Theme.Dimensions.BORDER_RADIUS.px)
                .fillMaxSize()
                .objectFit(ObjectFit.Cover),
            src = Res.Images.PROFILE_PHOTO
        )
    }
}