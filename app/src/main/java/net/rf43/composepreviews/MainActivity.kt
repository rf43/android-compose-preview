package net.rf43.composepreviews

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.rf43.composepreviews.ui.theme.ComposePreviewsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePreviewsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainGreeting()
                }
            }
        }
    }
}

@Composable
private fun MainGreeting() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
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

@Preview
@Composable
private fun MainActivityPreview() {
    ComposePreviewsTheme {
        Surface {
            MainGreeting()
        }
    }
}
