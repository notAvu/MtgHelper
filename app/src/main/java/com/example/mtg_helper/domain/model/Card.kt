package com.example.mtg_helper.domain.model

import com.example.mtg_helper.data.remote.dto.Prices

data class Card(
    val name: String,
    val id: String,
    val scryfallUri: String,
    val prices: Prices
)
