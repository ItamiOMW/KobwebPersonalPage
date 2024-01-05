package com.itami.personal_page.util

import com.varabyte.kobweb.compose.ui.graphics.Color

object Config {

    enum class Theme(val color: Color) {
        BLUE(color = Color.rgb(r = 33, g = 150, b = 243)),
        LIGHT_BLUE(color = Color.rgb(r = 168, g = 236, b = 255)),
        DARK_BLUE(color = Color.rgb(r = 34, g = 63, b = 94)),
        SOCIAL_ICON_BACKGROUND_LIGHT(color = Color.rgb(r = 230, g = 230, b = 230)),
        SOCIAL_ICON_BACKGROUND_DARK(color = Color.rgb(r = 48, g = 82, b = 118)),
        GRADIENT_ONE(color = Color.rgb(r = 161, g = 196, b = 253)),
        GRADIENT_ONE_DARK(color = Color.rgb(r = 19, g = 38, b = 58)),
        GRADIENT_TWO(color = Color.rgb(r = 194, g = 233, b = 251)),
        GRADIENT_TWO_DARK(color = Color.rgb(r = 20, g = 46, b = 73))
    }

    object Strings {
        const val NAME = "Vadim"
        const val PROFESSION = "Native Android Developer"
        const val ABOUT = "Lorem ipsum dolor sit amet, nisl tempus lorem adipiscing elit. Donec sollicitudin blandit tellus, ac sagittis ligula egestas consequat. Lorem ipsum dolor sit amet."
        const val LINK_TO_EMAIL = "mailto:itamiomw@gmail.com"
        const val CONTACT_BUTTON_TEXT = "Get in touch"
    }

    object Images {
        const val PHOTO = "photo.jpg"
    }

    object Fonts {
        const val POPPINS_REGULAR = "PoppinsRegular"
        const val POPPINS_MEDIUM = "PoppinsMedium"
        const val POPPINS_BOLD = "PoppinsBold"
    }

    object Icons {
        const val LIGHT_MODE = "ic_light_mode.svg"
        const val DARK_MODE = "ic_dark_mode.svg"
        const val MAIL = "ic_mail.svg"
        const val GITHUB = "ic_github.svg"
        const val DISCORD = "ic_discord.svg"
        const val TELEGRAM = "ic_telegram.svg"
    }

    object Dimens {
        const val BORDER_RADIUS = 8
        const val MAX_CARD_WIDTH = 1000
        const val MAX_CARD_HEIGHT = 600
        const val ICON_SIZE = 24
        const val ICON_SIZE_LG = 32
    }
}