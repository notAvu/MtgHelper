package com.example.mtg_helper.data
import com.example.mtg_helper.data.remote.dto.ScryfallSearchResultDto
import retrofit2.http.GET
import retrofit2.http.Path

interface ScryfallApiService {
    //search?order=released&unique=prints&q=card+name
    @GET("https://api.scryfall.com/cards/search?order=released&unique=prints&q={cardName}")
    suspend fun searchByCardName(@Path("cardName") cardName: String) : ScryfallSearchResultDto
}