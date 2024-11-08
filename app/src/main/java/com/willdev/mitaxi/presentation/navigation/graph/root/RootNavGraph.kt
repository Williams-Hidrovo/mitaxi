package com.willdev.mitaxi.presentation.navigation.graph.root

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.willdev.mitaxi.presentation.navigation.Graph
import com.willdev.mitaxi.presentation.navigation.graph.auth.AuthNavGraph

@Composable
fun RootNavGraph(navController: NavHostController){

    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTH
    ){
        AuthNavGraph(navController)

    }

}