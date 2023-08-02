package com.example.mtg_helper.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.mtg_helper.domain.model.CardListState
import com.example.mtg_helper.domain.use_cases.CardByNameUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CardSearchVM @Inject constructor(
    private val cardByNameUsecase: CardByNameUseCase,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _state = mutableStateOf(CardListState())
    val state : State<CardListState> = _state
    init {

    }
}