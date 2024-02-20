# Android Compose UI @Preview

Demonstrate the functionality and techniques that can be leveraged when using Android Compose UI @Preview

## Getting Started

Clone the project and open it in Android Studio. The project is set up to be built and run using 
the latest version of Android Studio. If using the Multi Preview functionality, ensure that the 
project is using the Hedgehog version of Android Studio.

## Project Layout
This project is set up such that it highlights the various aspects of the Android Compose UI @Preview functionality.
As such, it is laid out a bit differently from other Android projects you may have seen elsewhere. While the project
can be built and run, the `MainActivity` and what it renders is not the main focus.

The project is split up into separate areas to show off specific functionality.
* [Basic](app/src/main/java/net/rf43/composepreviews/basic)
  * Demonstrates typical setups that one might use when needing to render a simple preview.
* [Annotation](app/src/main/java/net/rf43/composepreviews/annotation)
  * This section contains examples that demonstrate how to setup and use custom annotations to render previews.
* [Parameter](app/src/main/java/net/rf43/composepreviews/parameter)
  * This section contains examples that demonstrate how to setup and use parameterized previews 
  * powered by [PreviewParameterProvider](https://developer.android.com/jetpack/compose/tooling/previews#preview-data) to render previews using different data.
* [Local Inspection Mode](app/src/main/java/net/rf43/composepreviews/localinspection)
  * This section contains examples that demonstrate how to setup and use [Local Inspection Mode](https://developer.android.com/jetpack/compose/tooling/previews#localinspectionmode) to render previews.
* [Multi Preview](app/src/main/java/net/rf43/composepreviews/multipreview)
  * This section contains examples that demonstrate how to setup and use [Multiprevew templates](https://developer.android.com/jetpack/compose/tooling/previews#multipreview-templates) to render previews.

### Prerequisites

This project uses Gradle version `8.2.2` and Kotlin version `1.8.10`
All examples are expected to work properly using modern versions of Android Jetpack Compose UI.
However, there is an exception...

Using the Multi Preview functionality is a recent addition and thus will require the following minimum dependencies
```Kotlin
// Any version BOM -> 2023.10.01+
implementation(platform("androidx.compose:compose-bom:2024.02.00"))

// Any version -> 1.6.0-alpha01+
implementation("androidx.compose.ui:ui-tooling-preview:1.6.1")
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
