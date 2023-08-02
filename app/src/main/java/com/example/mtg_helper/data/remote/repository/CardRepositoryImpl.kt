package com.example.mtg_helper.data.remote.repository

import com.example.mtg_helper.data.ScryfallApiService
import com.example.mtg_helper.data.remote.dto.ScryfallSearchResultDto
import com.example.mtg_helper.domain.repository.CardRepository
import javax.inject.Inject

class CardRepositoryImpl @Inject constructor(private val api: ScryfallApiService) : CardRepository {
    override suspend fun searchByCardName(cardName: String): ScryfallSearchResultDto {
        return api.searchByCardName((cardName))
    }
}