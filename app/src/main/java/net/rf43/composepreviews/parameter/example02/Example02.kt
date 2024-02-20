package net.rf43.composepreviews.parameter.example02

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import net.rf43.composepreviews.CardComposable
import net.rf43.composepreviews.CardConfig
import net.rf43.composepreviews.R
import net.rf43.composepreviews.ui.theme.ComposePreviewsTheme

/*
 * Combining the data into a single provider to provide a sequence of `CardConfig` data
 * to the `CardComposable` composable. This is useful when you want to preview the same
 * composable with different data.
 */

private class CardDataPreviewProvider : PreviewParameterProvider<CardConfig> {
    override val values: Sequence<CardConfig>
        get() = sequenceOf(
            CardConfig(
                title = "LLM Got Jokes",
                body = "Why did the scarecrow win an award? Because he was outstanding in " +
                        "his field!"
            ),
            CardConfig(
                title = "LLM Got Jokes",
                body = "Why did the scarecrow win an award? Because he was outstanding in " +
                        "his field!",
                iconConfig = CardConfig.IconConfig(
                    iconId = R.drawable.ic_baseline_air_24,
                    iconColor = Color(0xFF006B5D)
                )
            ),
            CardConfig(
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
            ),
            CardConfig(
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
                    iconId = R.drawable.ic_baseline_tag_24,
                    iconColor = Color(0xFF93000A)
                ),
                enableBorder = true
            )
        )
}

@Preview
@Composable
private fun ExamplePreview(
    @PreviewParameter(CardDataPreviewProvider::class) data: CardConfig
) {
    ComposePreviewsTheme {
        Surface {
            CardComposable(
                cardConfig = data
            )
        }
    }
}
