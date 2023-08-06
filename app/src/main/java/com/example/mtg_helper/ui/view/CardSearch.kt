package com.example.mtg_helper.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.mtg_helper.presentation.CardSearchVM

@Composable
fun CardSearch(navController: NavController, cardSearchVM: CardSearchVM = hiltViewModel()) {
    val state = cardSearchVM.state.value
    Column(){
        
        Text(text = "Title")
        Button(onClick = {navController.navigate(/*TODO*/0)}) {
            Text(text = "Search")
        }
    }
}