package com.example.mtg_helper.data.di

import com.example.mtg_helper.data.ScryfallApiService
import com.example.mtg_helper.data.remote.repository.CardRepository
import com.example.mtg_helper.data.remote.repository.CardRepositoryImpl

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideScryfallApi():ScryfallApiService{
        return Retrofit.Builder().baseUrl("").addConverterFactory(GsonConverterFactory.create()).build().create(ScryfallApiService::class.java)
    }
    @Provides
    @Singleton
    fun provideCardRepository(api:ScryfallApiService): CardRepository {
        return CardRepositoryImpl(api)
    }
}