package com.example.mtg_helper.domain.model

data class ScryfallSearchResult(
    val cards: List<Card>,
    val resultCount: Int
)
