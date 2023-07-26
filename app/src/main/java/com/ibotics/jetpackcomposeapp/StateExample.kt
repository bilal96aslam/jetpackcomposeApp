package com.ibotics.jetpackcomposeapp

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
//stateful composeable
fun NotificationScreen() {
    //this is called state hosting, bcz we sharing one state with two methods
    var count: MutableState<Int> = rememberSaveable{
        mutableStateOf(0)
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(1f)
    ) {
        NotificationsCounter(count.value, { count.value++ })
        MessageBar(count.value)
    }
}

@Composable
fun NotificationsCounter(count: Int, increment: () -> Unit) {
    /*var count: MutableState<Int> = remember {
        mutableStateOf(0)
    }*/
    //this will save the sate in the bundle not in composition so data will
    // not lost even we rotate the device
    //bundle only save premitive values
    //for other objects you have to make object serilaizable or parcelable

    Column(verticalArrangement = Arrangement.Center) {
        Text(text = "You have sent ${count} notifications")
        Button(onClick = {
          increment()
        }) {
            Text(text = "Send Notifications")
        }
    }
}

//state hosting
//this method is stateless compose
@Composable
fun MessageBar(count: Int) {
    Card(elevation = 4.dp) {
        Row(
            Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(imageVector = Icons.Outlined.Favorite, contentDescription = "",
            Modifier.padding(4.dp))
            Text(text = "Message send so far - $count")
        }
    }
}
