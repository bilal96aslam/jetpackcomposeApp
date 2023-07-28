package com.ibotics.jetpackcomposeapp.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ibotics.jetpackcomposeapp.DataManager
import com.ibotics.jetpackcomposeapp.R
import com.ibotics.jetpackcomposeapp.data.Quote

@Composable
fun QuotesDetail(quote: Quote) {
    //for back button handle
    BackHandler() {
        DataManager.switchPages(null)
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFFffffff),
                        Color(0xFFE3E3E3),
                    )
                )
            ),
    ) {
        Card(
            elevation = 4.dp,
            modifier = Modifier.padding(32.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(16.dp, 24.dp)
            ) {
                Image(painterResource(id = R.drawable.quote),
                    colorFilter = ColorFilter.tint(Color.White),
                    contentDescription = "Quote",
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.Black),
                    alignment = Alignment.TopStart,)
                Text(
                    text = quote.text,
                    fontSize = 14.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(0.dp, 8.dp, 0.dp, 8.dp)
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = quote.author,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Thin
                )
            }

        }

    }
}