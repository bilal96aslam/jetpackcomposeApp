package com.ibotics.jetpackcomposeapp

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ibotics.jetpackcomposeapp.ui.theme.JetpackcomposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackcomposeAppTheme {
                ReComposable()
            }
        }
    }
}

@Composable
fun ReComposable() {
    val state = remember {
        mutableStateOf(0.0)
    }
    Log.d("Tag","Log during initial")
    Button(onClick = {state.value=Math.random()}) {
        Log.d("Tag","Log during composition & recomposition")
        Text(text = state.value.toString())
    }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun PreviewMethod() {
    Text(
        text = "Hello",
        color = Color.White,
        modifier = Modifier
            .clickable { }
            .background(Color.Red)
            .size(200.dp)
            .padding(36.dp)
            .border(4.dp, color = Color.White)
            .clip(CircleShape)
            .background(Color.Green)
    )
}

@Composable
fun PreviewMethod2() {
    Row(
       verticalAlignment = Alignment.CenterVertically
    ) {
        //work same as frame layout
        Box{
            Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "",
            Modifier.size(50.dp))
            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "",
            Modifier.size(30.dp))
        }
        Column() {
            Text(text = "John Doe", fontSize = 22.sp, color = Color.Black, fontWeight = FontWeight.Bold)
            Text(text = "Software Developer", fontSize = 16.sp, color = Color.Gray,
                fontWeight = FontWeight.Thin)
        }
    }

}
