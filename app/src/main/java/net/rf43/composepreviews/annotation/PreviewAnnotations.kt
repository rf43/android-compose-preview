package net.rf43.composepreviews.annotation

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Preview

/*
 * Custom annotations to easily create different previews that contain different configurations.
 */

@Preview(
    name = "Light Mode",
    group = "UiMode",
    showBackground = true,
    uiMode = UI_MODE_NIGHT_NO
)
@Preview(
    name = "Dark Mode",
    group = "UiMode",
    showBackground = true,
    uiMode = UI_MODE_NIGHT_YES
)
annotation class UiModeThemePreview


@Preview(
    name = "Font Size: 100%",
    group = "Font Scaling",
    showBackground = true,
    fontScale = 1.0f
)
@Preview(
    name = "Font Size: 150%",
    group = "Font Scaling",
    showBackground = true,
    fontScale = 1.5f
)
@Preview(
    name = "Font Size: 200%",
    group = "Font Scaling",
    showBackground = true,
    fontScale = 2.0f
)
annotation class FontSizePreview
