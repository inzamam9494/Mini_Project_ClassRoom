package com.example.classroom_mini.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PeopleScreen(modifier: Modifier,
                 onClickToHome: () -> Unit,
                 onClickToAssign: () -> Unit) {
    Scaffold(
        bottomBar = {
            BottomAppBar() {
                IconButton(onClick = onClickToHome) {
                    HomeIcon(color = Color.Black,
                        modifier = Modifier.weight(0.1f))
                }
                IconButton(onClick = onClickToAssign) {
                    AssignIcon(color = Color.Black,
                        modifier = Modifier.weight(0.1f))
                }
                IconButton(onClick = { /*TODO*/ }) {
                    PeopleIcon(color = Color.Blue,
                        modifier = Modifier.weight(0.1f))
                }
            }
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Fetching data from API",
                    fontWeight = FontWeight.Bold
                )
            }

        }
    }
}

@Preview
@Composable
fun PeopleScreenPreview() {
    MaterialTheme {
        PeopleScreen(modifier = Modifier,{},{})
    }
}