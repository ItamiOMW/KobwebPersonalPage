package com.itami.personal_page.utils

enum class SocialIcon(
    val iconResLight: String,
    val iconResDark: String,
    val link: String,
) {
    Github(
        iconResLight = Res.Icons.GITHUB_PRIMARY_LIGHT,
        iconResDark = Res.Icons.GITHUB_PRIMARY_DARK,
        link = Res.Strings.HREF_GITHUB
    ),
    Telegram(
        iconResLight = Res.Icons.TELEGRAM_PRIMARY_LIGHT,
        iconResDark = Res.Icons.TELEGRAM_PRIMARY_DARK,
        link = Res.Strings.HREF_TELEGRAM
    ),
    Email(
        iconResLight = Res.Icons.MAIL_PRIMARY_LIGHT,
        iconResDark = Res.Icons.MAIL_PRIMARY_DARK,
        link = Res.Strings.HREF_EMAIL
    )
}