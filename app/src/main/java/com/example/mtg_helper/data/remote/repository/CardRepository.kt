package com.example.mtg_helper.data.remote.repository

import com.example.mtg_helper.data.remote.dto.ScryfallSearchResultDto

interface CardRepository {
    suspend fun searchByCardName(cardName:String): ScryfallSearchResultDto
}