package com.example.mtg_helper.domain.use_cases

import com.example.mtg_helper.common.Resource
import com.example.mtg_helper.data.remote.dto.toScryfallSearchResult
import com.example.mtg_helper.domain.repository.CardRepository
import com.example.mtg_helper.domain.model.Card
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class CardByNameUseCase @Inject constructor(private val repository: CardRepository) {
    operator fun invoke(cardName:String): Flow<Resource<List<Card>>> = flow {
        try
        {
            emit(Resource.Loading())
            val result = repository.searchByCardName(cardName)
            val cards = result.toScryfallSearchResult().cards
            emit(Resource.Success(cards))
        }catch (e:HttpException){
            emit(Resource.Error("HttpException"))
        }
        catch (e:IOException){
            emit(Resource.Error("IOEException"))
        }
    }
}