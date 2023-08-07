package com.ibotics.jetpackcomposeapp


import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ibotics.jetpackcomposeapp.api.TweetsyApi
import com.ibotics.jetpackcomposeapp.screens.CategoriesScreen
import com.ibotics.jetpackcomposeapp.screens.DetailScreen
import com.ibotics.jetpackcomposeapp.ui.theme.JetpackcomposeAppTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var tweetsy: TweetsyApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackcomposeAppTheme{
               // CategoriesScreen()
                DetailScreen()
            }
        }

    }
}




