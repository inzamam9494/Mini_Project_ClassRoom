package com.example.classroom_mini.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun StartScreen(
    modifier: Modifier,
    onClickToHome: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(10.dp)
    ) {
        Button(
            onClick = onClickToHome
        ) {
            Text(
                text = "Get Started",
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(0.1f)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ScreenPreview() {
    MaterialTheme {
        StartScreen(modifier = Modifier,
            onClickToHome = {})
    }
}