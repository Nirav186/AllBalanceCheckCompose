package com.example.allbalancecheckcompose.domain.repository

interface BankBalanceRepository {

    fun getBalance()
    fun blockAtmCard()
    fun getMiniStatement()

}