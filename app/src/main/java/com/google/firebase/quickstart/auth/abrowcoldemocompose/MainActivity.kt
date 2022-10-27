package com.google.firebase.quickstart.auth.abrowcoldemocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.firebase.quickstart.auth.abrowcoldemocompose.ui.theme.AbRowColDemoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AbRowColDemoComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}
@Composable
fun TextCell(text: String, modifier: Modifier = Modifier) {

    val cellModifier = Modifier
        .padding(4.dp)
        .size(100.dp, 100.dp)
        .border(width = 4.dp, color = Color.Black)

    Text(text = text, cellModifier.then(modifier),
        fontSize = 70.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center)
}
@Composable
fun MainScreen() {
    Column {
        Row {
            Column {
                TextCell("1")
                TextCell("2")
                TextCell("3")
            }

            Column {
                TextCell("4")
                TextCell("5")
                TextCell("6")
            }

            Column {
                TextCell("7")
                TextCell("8")
            }
        }
        Row {
            TextCell("9")
            TextCell("10")
            TextCell("11")
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    AbRowColDemoComposeTheme {
        MainScreen()
    }
}