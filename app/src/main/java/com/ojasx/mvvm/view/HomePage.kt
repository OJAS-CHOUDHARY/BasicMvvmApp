package com.ojasx.mvvm.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ojasx.mvvm.model.UserData
import com.ojasx.mvvm.viewmodel.HomeViewModel

@Composable
fun HomePage(modifier: Modifier = Modifier,viewModel: HomeViewModel) {
    val userData = viewModel.userdata.observeAsState()
    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        Button(onClick = {
viewModel.getUserData()
        }) {
            Text("Get data")
        }
        userData.value?.name?.let{
            Text("Name : $it")
        }
    }
}