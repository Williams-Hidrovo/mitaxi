package com.willdev.mitaxi.presentation.screens.auth.register


import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.willdev.mitaxi.presentation.screens.auth.register.components.RegisterContent
import com.willdev.mitaxi.ui.theme.MitaxiTheme

@Composable
fun RegisterScreen(navHostController: NavHostController) {



    Scaffold(
        contentWindowInsets = WindowInsets.navigationBars
    ) { paddingValues ->
        RegisterContent(navHostController=navHostController,paddingValues=paddingValues)

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Registerpreview(){
    MitaxiTheme{
        RegisterScreen(rememberNavController())
    }

}