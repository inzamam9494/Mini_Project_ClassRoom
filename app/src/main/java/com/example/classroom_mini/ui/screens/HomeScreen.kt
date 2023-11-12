package com.example.classroom_mini.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Assignment
import androidx.compose.material.icons.sharp.Home
import androidx.compose.material.icons.sharp.People
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
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier,
    onClickToAssign: () -> Unit,
    onClickToPeople: () -> Unit,
) {
    Scaffold(
        bottomBar = {
            BottomAppBar {
                IconButton(onClick = { /*TODO*/ }) {
                    HomeIcon(
                        color = Color.Green,
                        modifier = Modifier.weight(0.1f)
                    )
                }
                IconButton(onClick = onClickToAssign) {
                    AssignIcon(
                        color = Color.Black,
                        modifier = Modifier.weight(0.1f)
                    )
                }
                IconButton(onClick = onClickToPeople) {
                    PeopleIcon(
                        color = Color.Black,
                        modifier = Modifier.weight(0.1f)
                    )
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
                    text = "Home",
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun HomeIcon(
    color: Color,
    modifier: Modifier
) {
    Image(
        imageVector = Icons.Sharp.Home,
        contentDescription = "HomeIcon",
        colorFilter = ColorFilter.tint(color)
    )
}


@Composable
fun AssignIcon(
    color: Color,
    modifier: Modifier
) {
    Image(
        imageVector = Icons.Sharp.Assignment,
        contentDescription = "HomeIcon",
        colorFilter = ColorFilter.tint(color),
    )
}


@Composable
fun PeopleIcon(
    color: Color,
    modifier: Modifier
) {
    Image(
        imageVector = Icons.Sharp.People,
        contentDescription = "HomeIcon",
        colorFilter = ColorFilter.tint(color)
    )
}

@Preview
@Composable
fun HomeScreenPreview() {
    MaterialTheme {
        HomeScreen(modifier = Modifier, {}, {})
    }
}