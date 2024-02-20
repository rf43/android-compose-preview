package net.rf43.composepreviews.parameter.example03

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import net.rf43.composepreviews.CardComposable
import net.rf43.composepreviews.CardConfig
import net.rf43.composepreviews.CardConfig.IconConfig
import net.rf43.composepreviews.R
import net.rf43.composepreviews.ui.theme.ComposePreviewsTheme

/**
 * Using a Functional (SAM) Interface so that we can "hide"
 * the [CardConfig] as a [Composable] from the [PreviewParameterProvider]
 *
 * For more information about Single Abstract Method (SAM) interfaces, see the Kotlin Doc
 *
 * [Functional (SAM) Interface:](https://kotlinlang.org/docs/fun-interfaces.html)
 */
private fun interface CardDataWithComposable {
    @Composable
    fun value(): CardConfig
}

private class CardDataPreviewProvider : PreviewParameterProvider<CardDataWithComposable> {
    override val values: Sequence<CardDataWithComposable>
        get() = sequenceOf(
            CardDataWithComposable {
                CardConfig(
                    title = "LLM Got Jokes",
                    body = "Why did the scarecrow win an award? Because he was outstanding in " +
                            "his field!"
                )
            },
            CardDataWithComposable {
                CardConfig(
                    title = "LLM Got Jokes",
                    body = "Why did the scarecrow win an award? Because he was outstanding in " +
                            "his field!",
                    iconConfig = IconConfig(
                        iconId = R.drawable.ic_baseline_auto_graph_24,
                        iconColor = MaterialTheme.colorScheme.primary
                    )
                )
            },
            CardDataWithComposable {
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
                )
            },
            CardDataWithComposable {
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
                    iconConfig = IconConfig(
                        iconId = R.drawable.ic_baseline_air_24,
                        iconColor = MaterialTheme.colorScheme.secondary
                    ),
                    enableBorder = true
                )
            }
        )
}

@Preview
@Composable
private fun ExamplePreview(
    @PreviewParameter(CardDataPreviewProvider::class) data: CardDataWithComposable
) {
    ComposePreviewsTheme {
        Surface {
            CardComposable(
                cardConfig = data.value()
            )
        }
    }
}
