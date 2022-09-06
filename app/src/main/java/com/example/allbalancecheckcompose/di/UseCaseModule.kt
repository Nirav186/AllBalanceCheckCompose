package com.example.allbalancecheckcompose.di

import com.example.allbalancecheckcompose.data.usecases.bankbalance.UseCaseBlockAtmCard
import com.example.allbalancecheckcompose.data.usecases.bankbalance.UseCaseGetBalance
import com.example.allbalancecheckcompose.data.usecases.bankbalance.UseCaseGetMiniStatement
import com.example.allbalancecheckcompose.data.usecases.banklist.UseCaseGenerateListFromMap
import com.example.allbalancecheckcompose.data.usecases.banklist.UseCaseLoadJsonFromAsset
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun providesUseCaseGetBalance() = UseCaseGetBalance()

    @Provides
    fun providesUseCaseBlockAtmCard() = UseCaseBlockAtmCard()

    @Provides
    fun providesUseCaseGetMiniStatement() = UseCaseGetMiniStatement()

    @Provides
    fun providesUseCaseLoadJsonFromAsset() = UseCaseLoadJsonFromAsset()

    @Provides
    fun providesUseCaseGenerateListFromMap() = UseCaseGenerateListFromMap()
}