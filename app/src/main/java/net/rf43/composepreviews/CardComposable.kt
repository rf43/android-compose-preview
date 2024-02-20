package net.rf43.composepreviews

import androidx.annotation.DrawableRes
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import net.rf43.composepreviews.CardConfig.IconConfig

/**
 * A data class to hold card data
 *
 * @param title The title of the card
 * @param body The body content of the card
 * @param iconConfig An [IconConfig] object to hold data related to the icon, is nullable
 */
data class CardConfig(
    val title: String,
    val body: String,
    val iconConfig: IconConfig? = null,
    val enableBorder: Boolean = false
) {

    /**
     * A config object to hold card icon data
     *
     * @param iconId The drawable resource ID of the icon
     * @param iconColor The icon tint as a [Color], defaults to black (#FF000000) if no color
     * is provided
     */
    data class IconConfig(
        @DrawableRes val iconId: Int,
        val iconColor: Color = Color(0xFF000000)
    )
}

/**
 * A basic composable containing a [Card] with a title section containing an (optional) [Icon]
 * and (required) [String] and a body section composed of [String] text
 */
@Composable
fun CardComposable(
    modifier: Modifier = Modifier,
    cardConfig: CardConfig
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(24.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Column(
            modifier = Modifier
                .then(
                    if (cardConfig.enableBorder) Modifier.border(
                        1.dp,
                        Color.Black,
                        RoundedCornerShape(12.dp)
                    ) else Modifier
                )
                .padding(16.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                cardConfig.iconConfig?.let { iconConfig ->
                    Icon(
                        modifier = Modifier.size(36.dp),
                        painter = painterResource(id = iconConfig.iconId),
                        tint = iconConfig.iconColor,
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                }
                Text(
                    style = MaterialTheme.typography.titleLarge,
                    text = cardConfig.title
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                style = MaterialTheme.typography.bodyMedium,
                text = cardConfig.body
            )

        }
    }
}
