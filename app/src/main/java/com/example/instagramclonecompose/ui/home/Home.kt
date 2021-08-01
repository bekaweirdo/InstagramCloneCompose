package com.example.instagramclonecompose.ui.home

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.instagramclonecompose.R
import com.example.instagramclonecompose.ui.theme.fonts

@Composable
fun InstagramBottomBar(
    navController: NavController,
    tags: Array<HomeSections>,
    color: Color = Color.Cyan,
    contentColor: Color = Color.Blue
){
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val sections = remember { HomeSections.values() }
    val routes = remember { sections.map { it.route } }
    if(currentRoute in routes) {
        val currentSection = sections.first { it.route == currentRoute }

    }

}

enum class HomeSections(
    val icon: ImageVector,
    val route: String
) {
    HOME(Icons.Outlined.Home, "home/feed"),
    SEARCH(Icons.Outlined.Search, "home/search"),
    MEDIA(Icons.Outlined.Email,"home/media"),
    CART(Icons.Outlined.ShoppingCart, "home/cart"),
    PROFILE(Icons.Outlined.AccountCircle, "home/profile")
}

@Composable
fun topBar() {
    TopAppBar(
        title = { Text(text = "Instagram",fontFamily = fonts, fontSize = 18.sp) },
        backgroundColor = colorResource(id = R.color.black),
        contentColor = Color.White,
        actions = {
            Row{
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Filled.Add,
                        contentDescription = "Localized description"
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Filled.ThumbUp,
                        contentDescription = "Localized description"
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Filled.Message,
                        contentDescription = "Localized description"
                    )
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    topBar()
}