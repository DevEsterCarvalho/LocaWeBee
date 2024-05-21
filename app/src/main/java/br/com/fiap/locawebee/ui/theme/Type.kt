package br.com.fiap.locawebee.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import br.com.fiap.locawebee.R

val PoppinsBold = FontFamily(Font(R.font.poppins_bold))
val PoppinsRegular = FontFamily(Font(R.font.poppins_regular))
val PoppinsSemiBold = FontFamily(Font(R.font.poppins_semibold))
val PoppinsMedium = FontFamily(Font(R.font.poppins_medium))
val OpenSansRegular = FontFamily(Font(R.font.opensans_regular))
val Roboto = FontFamily(Font(R.font.roboto_regular))

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)