package com.example.instagramclonecompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.instagramclonecompose.ui.components.InstagramScaffold
import com.example.instagramclonecompose.ui.theme.InstagramCloneComposeTheme
import com.google.accompanist.insets.ProvideWindowInsets

@Composable
fun InstagramApp() {
    ProvideWindowInsets {
        InstagramCloneComposeTheme {
            val navController = rememberNavController()
//            InstagramScaffold(
//                bottomBar =
//            ) {
//
//            }
        }
    }
}