package com.example.allbalancecheckcompose.data.repository.bankbalance

import com.example.allbalancecheckcompose.data.usecases.bankbalance.UseCaseBlockAtmCard
import com.example.allbalancecheckcompose.data.usecases.bankbalance.UseCaseGetMiniStatement
import com.example.allbalancecheckcompose.data.usecases.bankbalance.UseCaseGetBalance
import com.example.allbalancecheckcompose.domain.repository.BankBalanceRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BankBalanceRepositoryImpl @Inject constructor(
    private val mUseCaseGetBalance: UseCaseGetBalance,
    private val mUseCaseBlockAtmCard: UseCaseBlockAtmCard,
    private val mUseCaseGetMiniStatement: UseCaseGetMiniStatement
) : BankBalanceRepository {
    override fun getBalance() {
        mUseCaseGetBalance.invoke()
    }

    override fun blockAtmCard() {
        mUseCaseBlockAtmCard.invoke()
    }

    override fun getMiniStatement() {
        mUseCaseGetMiniStatement.invoke()
    }
}