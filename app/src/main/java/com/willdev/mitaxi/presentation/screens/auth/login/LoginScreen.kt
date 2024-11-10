package com.willdev.mitaxi.presentation.screens.auth.login

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable


import androidx.navigation.NavHostController
import com.willdev.mitaxi.presentation.screens.auth.login.components.LoginContent

//las vistas se declaran como funciones
@Composable
fun LoginScreen(navHostController: NavHostController) {

    //siempre hay una parte que es Scaffold
    Scaffold (
        contentWindowInsets = WindowInsets.navigationBars
    ) {paddingValues ->
        LoginContent(navHostController=navHostController,paddingValues=paddingValues)


    }
}
