package com.example.mtg_helper.common

object ScryfallApiConstants {
    const val BASE_URI = "https://api.scryfall.com/"
    const val CARD_SEARCH_PARAMS = "order=released&include_multilingual=true&unique=prints&q="
    const val CARD_SEARCH = "cards/search?$CARD_SEARCH_PARAMS"

    const val CARD_NAME_PARAM = "cardName"
}