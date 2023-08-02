package com.example.mtg_helper.data.remote.dto

import com.example.mtg_helper.domain.model.ScryfallSearchResult

data class ScryfallSearchResultDto(
    val `data`: List<CardDto>,
    val has_more: Boolean,
    val `object`: String,
    val total_cards: Int
)

fun ScryfallSearchResultDto.toScryfallSearchResult(): ScryfallSearchResult {
    return ScryfallSearchResult(
        cards = data.map { it.toCard() }, resultCount = total_cards
    )
}