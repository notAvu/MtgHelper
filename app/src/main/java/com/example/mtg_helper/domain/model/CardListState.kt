package com.example.mtg_helper.domain.model

data class CardListState (
    val isLoading:Boolean= false,
    val cardList : List<Card> = emptyList(),
    val error: String = ""
)