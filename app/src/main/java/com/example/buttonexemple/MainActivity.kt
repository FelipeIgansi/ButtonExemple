package com.example.buttonexemple

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buttonexemple.ui.theme.ButtonExempleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ButtonExempleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ShowButton(padding = innerPadding)
                }
            }
        }
    }
}

@Composable
fun ShowButton(padding: PaddingValues) {
    Box(modifier = Modifier.padding(padding)) {
        OutlinedButton(
            onClick = { Log.i("botao", "ShowButton: O botao foi clicado!!!") },
            border = BorderStroke(1.dp, Color.DarkGray),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red),
            shape = CircleShape
        ) {
            Text(text = "Cadastrar")
            Icon(Icons.Default.Done, contentDescription = "")
        }
/*        IconButton(onClick = { *//*TODO*//* }) {
            Icon(Icons.Default.KeyboardArrowLeft, contentDescription = "")
        }*/
    }
}

@Preview(showBackground = true)
@Composable
fun ShowButtonPreview() {
    ShowButton(PaddingValues())
}