package com.ibotics.jetpackcomposeapp.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ibotics.jetpackcomposeapp.models.TweetListItem
import com.ibotics.jetpackcomposeapp.viewmodel.CategoryViewModel
import com.ibotics.jetpackcomposeapp.viewmodel.DetailViewModel

@Composable
fun DetailScreen() {
    val detailViewModel: DetailViewModel = viewModel()
    val tweets = detailViewModel.tweets.collectAsState()
    LazyColumn(content = {
        items(tweets.value){
           TweetListItem(tweet = it.text)
        }
    })
}

@Composable
fun TweetListItem(tweet: String) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        border = BorderStroke(1.dp, Color(0xFFCCCCCC)),
        content = {
            Text(
                text = tweet,
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.body2
            )
        }
    )
}