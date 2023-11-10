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
fun AssignmentScreen(modifier: Modifier,
                     onClickToHome: () -> Unit,
                     onClickToPeople: () -> Unit,) {
    Scaffold(
        bottomBar = {
            BottomAppBar() {
                IconButton(onClick = onClickToHome) {
                    HomeIcon(color = Color.Black,
                        modifier = Modifier.weight(0.1f))
                }
                IconButton(onClick = { /*TODO*/ }) {
                    AssignIcon(color = Color.Blue,
                        modifier = Modifier.weight(0.1f))
                }
                IconButton(onClick = onClickToPeople) {
                    PeopleIcon(color = Color.Black,
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
                    text = "Take a Assignment",
                    fontWeight = FontWeight.Bold
                )
            }

        }
    }
}

@Preview
@Composable
fun AssignmentScreenPreview() {
    MaterialTheme {
        AssignmentScreen(modifier = Modifier,{},{})
    }
}