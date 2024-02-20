package net.rf43.composepreviews.localinspection.example01

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LocalInspectionExample01() {
    if (LocalInspectionMode.current) {
        // This content will only be displayed in the preview
        Text(text = "Local Inspection Mode")
    } else {
        // This content will only be displayed in the app
        Text(text = "App Mode")
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
private fun LocalInspectionExample01Preview() {
    LocalInspectionExample01()
}