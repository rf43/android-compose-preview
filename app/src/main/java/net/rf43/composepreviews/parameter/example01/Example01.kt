package net.rf43.composepreviews.parameter.example01

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import net.rf43.composepreviews.CardComposable
import net.rf43.composepreviews.CardConfig
import net.rf43.composepreviews.R
import net.rf43.composepreviews.ui.theme.ComposePreviewsTheme

/*
 * Implementing previews with different parameters to create different configurations
 * of the  composable.
 */

@Preview
@Composable
private fun PreviewNoIcon() {
    ComposePreviewsTheme {
        Surface {
            CardComposable(
                cardConfig = CardConfig(
                    title = "Whiskers the Squirrel",
                    body = "In the heart of a sun-dappled forest lived Whiskers, a tiny squirrel " +
                            "with the fluffiest tail but the clumsiest of steps. Unlike his " +
                            "nimble friends, Whiskers often found himself tumbling from trees, " +
                            "much to the amusement of his woodland companions. Yet, what " +
                            "Whiskers lacked in grace, he made up for in heart, always sharing " +
                            "his stash of acorns. One breezy afternoon, as he fumbled yet " +
                            "another landing, he stumbled upon a hidden grove bursting with " +
                            "nuts. With a giggle and a wiggle of his bushy tail, he decided to " +
                            "host the forest's grandest feast, turning his blunder into the " +
                            "season's biggest wonder."
                )
            )
        }
    }
}

@Preview
@Composable
private fun PreviewWithIcon() {
    ComposePreviewsTheme {
        Surface {
            CardComposable(
                cardConfig = CardConfig(
                    title = "Whiskers the Squirrel",
                    body = "In the heart of a sun-dappled forest lived Whiskers, a tiny squirrel " +
                            "with the fluffiest tail but the clumsiest of steps. Unlike his " +
                            "nimble friends, Whiskers often found himself tumbling from trees, " +
                            "much to the amusement of his woodland companions. Yet, what " +
                            "Whiskers lacked in grace, he made up for in heart, always sharing " +
                            "his stash of acorns. One breezy afternoon, as he fumbled yet " +
                            "another landing, he stumbled upon a hidden grove bursting with " +
                            "nuts. With a giggle and a wiggle of his bushy tail, he decided to " +
                            "host the forest's grandest feast, turning his blunder into the " +
                            "season's biggest wonder.",
                    iconConfig = CardConfig.IconConfig(
                        iconId = R.drawable.ic_baseline_air_24,
                        iconColor = Color(0xFF004D40)
                    )
                )
            )
        }
    }
}
