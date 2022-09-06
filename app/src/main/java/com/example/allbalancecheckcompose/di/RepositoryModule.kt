package com.example.allbalancecheckcompose.di

import com.example.allbalancecheckcompose.data.repository.bankbalance.BankBalanceRepositoryImpl
import com.example.allbalancecheckcompose.data.repository.banklist.BankSelectionRepositoryImpl
import com.example.allbalancecheckcompose.domain.repository.BankBalanceRepository
import com.example.allbalancecheckcompose.domain.repository.BankSelectionRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

//    @Binds
//    abstract fun provideRTORepositoryImpl(repositoryImpl: RtoRepositoryImpl): RtoRepository
//
    @Binds
    abstract fun provideBankBalanceRepository(repositoryImpl: BankBalanceRepositoryImpl): BankBalanceRepository

    @Binds
    abstract fun provideBankSelectionRepositoryImpl(bankSelectionRepositoryImpl: BankSelectionRepositoryImpl): BankSelectionRepository

//    @Binds
//    abstract fun provideCalculatorRepositoryImpl(calculatorRepositoryImpl: CalculatorRepositoryImpl): CalculatorRepository
//
//    @Binds
//    abstract fun provideFdRdRepositoryImpl(fdRdRepositoryImpl: FdRdRepositoryImpl): FdRdRepository
}