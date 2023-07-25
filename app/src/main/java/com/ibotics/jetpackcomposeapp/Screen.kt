package com.ibotics.jetpackcomposeapp

import android.graphics.Paint.Style
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(heightDp = 500)
fun PreviewItem() {
    /*Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        getCategory().map {
            BlogCategory(img = it.img, title = it.title, subtitle = it.subtitle)
        }
    }*/
    LazyColumn(content = {
        items(getCategory()){
            BlogCategory(img = it.img, title = it.title, subtitle = it.subtitle)
        }
    })
}

@Composable
fun BlogCategory(img: Int, title: String, subtitle: String) {
    Card(elevation = 8.dp, modifier = Modifier.padding(8.dp)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "", modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            ItemDescription(title, subtitle, Modifier.weight(.8f))
        }
    }
}

@Composable
fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(text = title, style = MaterialTheme.typography.h6)
        Text(
            text = subtitle, style = MaterialTheme.typography.subtitle1,
            fontSize = 12.sp, fontWeight = FontWeight.Thin
        )
    }
}

data class Category(val img: Int, val title: String, val subtitle: String)

fun getCategory(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.ic_launcher_background, "Hello", "World"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Hi", "World"))
    list.add(Category(R.drawable.ic_launcher_background, "Hey", "World"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Hello", "World"))
    list.add(Category(R.drawable.ic_launcher_background, "Hello", "World"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Hi", "World"))
    list.add(Category(R.drawable.ic_launcher_background, "Hey", "World"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Hello", "World"))
    list.add(Category(R.drawable.ic_launcher_background, "Hello", "World"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Hi", "World"))
    list.add(Category(R.drawable.ic_launcher_background, "Hey", "World"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Hello", "World"))
    list.add(Category(R.drawable.ic_launcher_background, "Hello", "World"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Hi", "World"))
    list.add(Category(R.drawable.ic_launcher_background, "Hey", "World"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Hello", "World"))
    return list
}