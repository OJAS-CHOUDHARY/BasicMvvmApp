package com.ojasx.mvvm

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
import androidx.lifecycle.ViewModelProvider
import com.ojasx.mvvm.ui.theme.MvvmTheme
import com.ojasx.mvvm.view.HomePage
import com.ojasx.mvvm.viewmodel.HomeViewModel
import androidx.compose.material3.Scaffold


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val homeViewModel = ViewModelProvider(this)[HomeViewModel::class]

        setContent{
            MvvmTheme {
                Scaffold(modifier = Modifier.fillMaxSize()){ innerPadding ->
                    HomePage(modifier = Modifier.padding(innerPadding), viewModel = homeViewModel)
                }
            }
            }
        }
    }

