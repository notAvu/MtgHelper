package com.example.mtg_helper.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.mtg_helper.common.Resource
import com.example.mtg_helper.common.ScryfallApiConstants
import com.example.mtg_helper.domain.model.CardListState
import com.example.mtg_helper.domain.use_cases.CardByNameUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CardSearchVM @Inject constructor(
    private val cardByNameUsecase: CardByNameUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _state = mutableStateOf(CardListState())
    val state : State<CardListState> = _state
    init {
        savedStateHandle.get<String>(ScryfallApiConstants.CARD_NAME_PARAM)?.let{ cardName -> getCardByName(cardName)}
    }
    private fun getCardByName(name :String){
        cardByNameUsecase(name).onEach {result ->
            when(result){
                is Resource.Success->{
                    _state.value = CardListState(cardList  = result.data ?: emptyList())
                }
                is Resource.Loading->{
                    _state.value = CardListState(true)
                }
                is Resource.Error->{
                    _state.value = CardListState(error = "Unexpected error")
                }
            }
        }
    }
}