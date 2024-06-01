package cd.bmduka.woof.ui.theme
import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import cd.bmduka.woof.ui.theme.backgroundDark
import cd.bmduka.woof.ui.theme.backgroundDarkHighContrast
import cd.bmduka.woof.ui.theme.backgroundDarkMediumContrast
import cd.bmduka.woof.ui.theme.backgroundLight
import cd.bmduka.woof.ui.theme.backgroundLightHighContrast
import cd.bmduka.woof.ui.theme.backgroundLightMediumContrast
import cd.bmduka.woof.ui.theme.errorContainerDark
import cd.bmduka.woof.ui.theme.errorContainerDarkHighContrast
import cd.bmduka.woof.ui.theme.errorContainerDarkMediumContrast
import cd.bmduka.woof.ui.theme.errorContainerLight
import cd.bmduka.woof.ui.theme.errorContainerLightHighContrast
import cd.bmduka.woof.ui.theme.errorContainerLightMediumContrast
import cd.bmduka.woof.ui.theme.errorDark
import cd.bmduka.woof.ui.theme.errorDarkHighContrast
import cd.bmduka.woof.ui.theme.errorDarkMediumContrast
import cd.bmduka.woof.ui.theme.errorLight
import cd.bmduka.woof.ui.theme.errorLightHighContrast
import cd.bmduka.woof.ui.theme.errorLightMediumContrast
import cd.bmduka.woof.ui.theme.inverseOnSurfaceDark
import cd.bmduka.woof.ui.theme.inverseOnSurfaceDarkHighContrast
import cd.bmduka.woof.ui.theme.inverseOnSurfaceDarkMediumContrast
import cd.bmduka.woof.ui.theme.inverseOnSurfaceLight
import cd.bmduka.woof.ui.theme.inverseOnSurfaceLightHighContrast
import cd.bmduka.woof.ui.theme.inverseOnSurfaceLightMediumContrast
import cd.bmduka.woof.ui.theme.inversePrimaryDark
import cd.bmduka.woof.ui.theme.inversePrimaryDarkHighContrast
import cd.bmduka.woof.ui.theme.inversePrimaryDarkMediumContrast
import cd.bmduka.woof.ui.theme.inversePrimaryLight
import cd.bmduka.woof.ui.theme.inversePrimaryLightHighContrast
import cd.bmduka.woof.ui.theme.inversePrimaryLightMediumContrast
import cd.bmduka.woof.ui.theme.inverseSurfaceDark
import cd.bmduka.woof.ui.theme.inverseSurfaceDarkHighContrast
import cd.bmduka.woof.ui.theme.inverseSurfaceDarkMediumContrast
import cd.bmduka.woof.ui.theme.inverseSurfaceLight
import cd.bmduka.woof.ui.theme.inverseSurfaceLightHighContrast
import cd.bmduka.woof.ui.theme.inverseSurfaceLightMediumContrast
import cd.bmduka.woof.ui.theme.onBackgroundDark
import cd.bmduka.woof.ui.theme.onBackgroundDarkHighContrast
import cd.bmduka.woof.ui.theme.onBackgroundDarkMediumContrast
import cd.bmduka.woof.ui.theme.onBackgroundLight
import cd.bmduka.woof.ui.theme.onBackgroundLightHighContrast
import cd.bmduka.woof.ui.theme.onBackgroundLightMediumContrast
import cd.bmduka.woof.ui.theme.onErrorContainerDark
import cd.bmduka.woof.ui.theme.onErrorContainerDarkHighContrast
import cd.bmduka.woof.ui.theme.onErrorContainerDarkMediumContrast
import cd.bmduka.woof.ui.theme.onErrorContainerLight
import cd.bmduka.woof.ui.theme.onErrorContainerLightHighContrast
import cd.bmduka.woof.ui.theme.onErrorContainerLightMediumContrast
import cd.bmduka.woof.ui.theme.onErrorDark
import cd.bmduka.woof.ui.theme.onErrorDarkHighContrast
import cd.bmduka.woof.ui.theme.onErrorDarkMediumContrast
import cd.bmduka.woof.ui.theme.onErrorLight
import cd.bmduka.woof.ui.theme.onErrorLightHighContrast
import cd.bmduka.woof.ui.theme.onErrorLightMediumContrast
import cd.bmduka.woof.ui.theme.onPrimaryContainerDark
import cd.bmduka.woof.ui.theme.onPrimaryContainerDarkHighContrast
import cd.bmduka.woof.ui.theme.onPrimaryContainerDarkMediumContrast
import cd.bmduka.woof.ui.theme.onPrimaryContainerLight
import cd.bmduka.woof.ui.theme.onPrimaryContainerLightHighContrast
import cd.bmduka.woof.ui.theme.onPrimaryContainerLightMediumContrast
import cd.bmduka.woof.ui.theme.onPrimaryDark
import cd.bmduka.woof.ui.theme.onPrimaryDarkHighContrast
import cd.bmduka.woof.ui.theme.onPrimaryDarkMediumContrast
import cd.bmduka.woof.ui.theme.onPrimaryLight
import cd.bmduka.woof.ui.theme.onPrimaryLightHighContrast
import cd.bmduka.woof.ui.theme.onPrimaryLightMediumContrast
import cd.bmduka.woof.ui.theme.onSecondaryContainerDark
import cd.bmduka.woof.ui.theme.onSecondaryContainerDarkHighContrast
import cd.bmduka.woof.ui.theme.onSecondaryContainerDarkMediumContrast
import cd.bmduka.woof.ui.theme.onSecondaryContainerLight
import cd.bmduka.woof.ui.theme.onSecondaryContainerLightHighContrast
import cd.bmduka.woof.ui.theme.onSecondaryContainerLightMediumContrast
import cd.bmduka.woof.ui.theme.onSecondaryDark
import cd.bmduka.woof.ui.theme.onSecondaryDarkHighContrast
import cd.bmduka.woof.ui.theme.onSecondaryDarkMediumContrast
import cd.bmduka.woof.ui.theme.onSecondaryLight
import cd.bmduka.woof.ui.theme.onSecondaryLightHighContrast
import cd.bmduka.woof.ui.theme.onSecondaryLightMediumContrast
import cd.bmduka.woof.ui.theme.onSurfaceDark
import cd.bmduka.woof.ui.theme.onSurfaceDarkHighContrast
import cd.bmduka.woof.ui.theme.onSurfaceDarkMediumContrast
import cd.bmduka.woof.ui.theme.onSurfaceLight
import cd.bmduka.woof.ui.theme.onSurfaceLightHighContrast
import cd.bmduka.woof.ui.theme.onSurfaceLightMediumContrast
import cd.bmduka.woof.ui.theme.onSurfaceVariantDark
import cd.bmduka.woof.ui.theme.onSurfaceVariantDarkHighContrast
import cd.bmduka.woof.ui.theme.onSurfaceVariantDarkMediumContrast
import cd.bmduka.woof.ui.theme.onSurfaceVariantLight
import cd.bmduka.woof.ui.theme.onSurfaceVariantLightHighContrast
import cd.bmduka.woof.ui.theme.onSurfaceVariantLightMediumContrast
import cd.bmduka.woof.ui.theme.onTertiaryContainerDark
import cd.bmduka.woof.ui.theme.onTertiaryContainerDarkHighContrast
import cd.bmduka.woof.ui.theme.onTertiaryContainerDarkMediumContrast
import cd.bmduka.woof.ui.theme.onTertiaryContainerLight
import cd.bmduka.woof.ui.theme.onTertiaryContainerLightHighContrast
import cd.bmduka.woof.ui.theme.onTertiaryContainerLightMediumContrast
import cd.bmduka.woof.ui.theme.onTertiaryDark
import cd.bmduka.woof.ui.theme.onTertiaryDarkHighContrast
import cd.bmduka.woof.ui.theme.onTertiaryDarkMediumContrast
import cd.bmduka.woof.ui.theme.onTertiaryLight
import cd.bmduka.woof.ui.theme.onTertiaryLightHighContrast
import cd.bmduka.woof.ui.theme.onTertiaryLightMediumContrast
import cd.bmduka.woof.ui.theme.outlineDark
import cd.bmduka.woof.ui.theme.outlineDarkHighContrast
import cd.bmduka.woof.ui.theme.outlineDarkMediumContrast
import cd.bmduka.woof.ui.theme.outlineLight
import cd.bmduka.woof.ui.theme.outlineLightHighContrast
import cd.bmduka.woof.ui.theme.outlineLightMediumContrast
import cd.bmduka.woof.ui.theme.outlineVariantDark
import cd.bmduka.woof.ui.theme.outlineVariantDarkHighContrast
import cd.bmduka.woof.ui.theme.outlineVariantDarkMediumContrast
import cd.bmduka.woof.ui.theme.outlineVariantLight
import cd.bmduka.woof.ui.theme.outlineVariantLightHighContrast
import cd.bmduka.woof.ui.theme.outlineVariantLightMediumContrast
import cd.bmduka.woof.ui.theme.primaryContainerDark
import cd.bmduka.woof.ui.theme.primaryContainerDarkHighContrast
import cd.bmduka.woof.ui.theme.primaryContainerDarkMediumContrast
import cd.bmduka.woof.ui.theme.primaryContainerLight
import cd.bmduka.woof.ui.theme.primaryContainerLightHighContrast
import cd.bmduka.woof.ui.theme.primaryContainerLightMediumContrast
import cd.bmduka.woof.ui.theme.primaryDark
import cd.bmduka.woof.ui.theme.primaryDarkHighContrast
import cd.bmduka.woof.ui.theme.primaryDarkMediumContrast
import cd.bmduka.woof.ui.theme.primaryLight
import cd.bmduka.woof.ui.theme.primaryLightHighContrast
import cd.bmduka.woof.ui.theme.primaryLightMediumContrast
import cd.bmduka.woof.ui.theme.scrimDark
import cd.bmduka.woof.ui.theme.scrimDarkHighContrast
import cd.bmduka.woof.ui.theme.scrimDarkMediumContrast
import cd.bmduka.woof.ui.theme.scrimLight
import cd.bmduka.woof.ui.theme.scrimLightHighContrast
import cd.bmduka.woof.ui.theme.scrimLightMediumContrast
import cd.bmduka.woof.ui.theme.secondaryContainerDark
import cd.bmduka.woof.ui.theme.secondaryContainerDarkHighContrast
import cd.bmduka.woof.ui.theme.secondaryContainerDarkMediumContrast
import cd.bmduka.woof.ui.theme.secondaryContainerLight
import cd.bmduka.woof.ui.theme.secondaryContainerLightHighContrast
import cd.bmduka.woof.ui.theme.secondaryContainerLightMediumContrast
import cd.bmduka.woof.ui.theme.secondaryDark
import cd.bmduka.woof.ui.theme.secondaryDarkHighContrast
import cd.bmduka.woof.ui.theme.secondaryDarkMediumContrast
import cd.bmduka.woof.ui.theme.secondaryLight
import cd.bmduka.woof.ui.theme.secondaryLightHighContrast
import cd.bmduka.woof.ui.theme.secondaryLightMediumContrast
import cd.bmduka.woof.ui.theme.surfaceBrightDark
import cd.bmduka.woof.ui.theme.surfaceBrightDarkHighContrast
import cd.bmduka.woof.ui.theme.surfaceBrightDarkMediumContrast
import cd.bmduka.woof.ui.theme.surfaceBrightLight
import cd.bmduka.woof.ui.theme.surfaceBrightLightHighContrast
import cd.bmduka.woof.ui.theme.surfaceBrightLightMediumContrast
import cd.bmduka.woof.ui.theme.surfaceContainerDark
import cd.bmduka.woof.ui.theme.surfaceContainerDarkHighContrast
import cd.bmduka.woof.ui.theme.surfaceContainerDarkMediumContrast
import cd.bmduka.woof.ui.theme.surfaceContainerHighDark
import cd.bmduka.woof.ui.theme.surfaceContainerHighDarkHighContrast
import cd.bmduka.woof.ui.theme.surfaceContainerHighDarkMediumContrast
import cd.bmduka.woof.ui.theme.surfaceContainerHighLight
import cd.bmduka.woof.ui.theme.surfaceContainerHighLightHighContrast
import cd.bmduka.woof.ui.theme.surfaceContainerHighLightMediumContrast
import cd.bmduka.woof.ui.theme.surfaceContainerHighestDark
import cd.bmduka.woof.ui.theme.surfaceContainerHighestDarkHighContrast
import cd.bmduka.woof.ui.theme.surfaceContainerHighestDarkMediumContrast
import cd.bmduka.woof.ui.theme.surfaceContainerHighestLight
import cd.bmduka.woof.ui.theme.surfaceContainerHighestLightHighContrast
import cd.bmduka.woof.ui.theme.surfaceContainerHighestLightMediumContrast
import cd.bmduka.woof.ui.theme.surfaceContainerLight
import cd.bmduka.woof.ui.theme.surfaceContainerLightHighContrast
import cd.bmduka.woof.ui.theme.surfaceContainerLightMediumContrast
import cd.bmduka.woof.ui.theme.surfaceContainerLowDark
import cd.bmduka.woof.ui.theme.surfaceContainerLowDarkHighContrast
import cd.bmduka.woof.ui.theme.surfaceContainerLowDarkMediumContrast
import cd.bmduka.woof.ui.theme.surfaceContainerLowLight
import cd.bmduka.woof.ui.theme.surfaceContainerLowLightHighContrast
import cd.bmduka.woof.ui.theme.surfaceContainerLowLightMediumContrast
import cd.bmduka.woof.ui.theme.surfaceContainerLowestDark
import cd.bmduka.woof.ui.theme.surfaceContainerLowestDarkHighContrast
import cd.bmduka.woof.ui.theme.surfaceContainerLowestDarkMediumContrast
import cd.bmduka.woof.ui.theme.surfaceContainerLowestLight
import cd.bmduka.woof.ui.theme.surfaceContainerLowestLightHighContrast
import cd.bmduka.woof.ui.theme.surfaceContainerLowestLightMediumContrast
import cd.bmduka.woof.ui.theme.surfaceDark
import cd.bmduka.woof.ui.theme.surfaceDarkHighContrast
import cd.bmduka.woof.ui.theme.surfaceDarkMediumContrast
import cd.bmduka.woof.ui.theme.surfaceDimDark
import cd.bmduka.woof.ui.theme.surfaceDimDarkHighContrast
import cd.bmduka.woof.ui.theme.surfaceDimDarkMediumContrast
import cd.bmduka.woof.ui.theme.surfaceDimLight
import cd.bmduka.woof.ui.theme.surfaceDimLightHighContrast
import cd.bmduka.woof.ui.theme.surfaceDimLightMediumContrast
import cd.bmduka.woof.ui.theme.surfaceLight
import cd.bmduka.woof.ui.theme.surfaceLightHighContrast
import cd.bmduka.woof.ui.theme.surfaceLightMediumContrast
import cd.bmduka.woof.ui.theme.surfaceVariantDark
import cd.bmduka.woof.ui.theme.surfaceVariantDarkHighContrast
import cd.bmduka.woof.ui.theme.surfaceVariantDarkMediumContrast
import cd.bmduka.woof.ui.theme.surfaceVariantLight
import cd.bmduka.woof.ui.theme.surfaceVariantLightHighContrast
import cd.bmduka.woof.ui.theme.surfaceVariantLightMediumContrast
import cd.bmduka.woof.ui.theme.tertiaryContainerDark
import cd.bmduka.woof.ui.theme.tertiaryContainerDarkHighContrast
import cd.bmduka.woof.ui.theme.tertiaryContainerDarkMediumContrast
import cd.bmduka.woof.ui.theme.tertiaryContainerLight
import cd.bmduka.woof.ui.theme.tertiaryContainerLightHighContrast
import cd.bmduka.woof.ui.theme.tertiaryContainerLightMediumContrast
import cd.bmduka.woof.ui.theme.tertiaryDark
import cd.bmduka.woof.ui.theme.tertiaryDarkHighContrast
import cd.bmduka.woof.ui.theme.tertiaryDarkMediumContrast
import cd.bmduka.woof.ui.theme.tertiaryLight
import cd.bmduka.woof.ui.theme.tertiaryLightHighContrast
import cd.bmduka.woof.ui.theme.tertiaryLightMediumContrast

private val LightColors = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
)

private val DarkColors = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,

)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)



@Composable
fun WoofTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColors
        else -> LightColors
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        shapes = Shapes,
        typography = Typography,
        content = content
    )
}