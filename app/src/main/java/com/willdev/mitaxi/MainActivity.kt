package com.willdev.mitaxi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.willdev.mitaxi.presentation.navigation.graph.root.RootNavGraph
import com.willdev.mitaxi.presentation.screens.auth.login.LoginScreen
import com.willdev.mitaxi.ui.theme.MitaxiTheme

class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MitaxiTheme {
                Surface {
                    navController= rememberNavController()
                    RootNavGraph(navController)
                }
            }
        }
    }
}
