package com.stu71954.jetpackcomposenavigationphill

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.stu71954.jetpackcomposenavigationphill.ui.theme.JetpackComposeNavigationPhillTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeNavigationPhillTheme {
                AppNavigation()
            }
        }
    }
}
