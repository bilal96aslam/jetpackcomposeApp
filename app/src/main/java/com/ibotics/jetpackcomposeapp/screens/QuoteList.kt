package com.ibotics.jetpackcomposeapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.ibotics.jetpackcomposeapp.data.Quote


@Composable
fun QuoteList(data: Array<Quote>, onClick: (quote: Quote) -> Unit) {
    LazyColumn(content = {
        items(data) {
            QuotesListItem(quote = it, onClick)
        }
    })
}