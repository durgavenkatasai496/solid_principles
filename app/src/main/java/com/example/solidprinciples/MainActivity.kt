package com.example.solidprinciples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.solidprinciples.navigation.NavGraphComposable
import com.example.solidprinciples.ui.theme.SOLIDPrinciplesTheme


/*
 * SOLID Principle :
 *
 * S - Single Responsibility Principle
 * O - Open/Closed Principle
 * L - Liskov Substitution Principle
 * I - Interface Segregation Principle
 * D - Dependency Inversion Principle
 *
 */

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SOLIDPrinciplesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    var navHostController = rememberNavController()
                    NavGraphComposable(navHostController,innerPadding)
                }
            }
        }
    }
}

