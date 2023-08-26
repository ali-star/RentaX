package com.alistar.rentax

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.alistar.rentax.component.TopAppBar
import com.alistar.rentax.ui.Colors

@Composable
fun App() {
    MaterialTheme(
        colors = MaterialTheme.colors.copy(
            primary = Colors.primary,
            secondary = Colors.secondary,
            background = Colors.background,
            surface = Colors.surface,
            onPrimary = Colors.onPrimary,
            onSecondary = Colors.onSecondary,
            onBackground = Colors.onBackground,
            onSurface = Colors.onSurface,
        ),
    ) {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column {
                TopAppBar()
            }
        }
    }
}

@Preview
@Composable
fun AppPreview() {
    App()
}

fun main() = application {
    Window(
        title = "RentalX",
        state = rememberWindowState(size = DpSize(width = 350.dp, height = 700.dp)),
        onCloseRequest = ::exitApplication
    ) {
        App()
    }
}
