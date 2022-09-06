package com.example.allbalancecheckcompose.component.bankbalance

import androidx.lifecycle.ViewModel
import com.example.allbalancecheckcompose.domain.repository.BankBalanceRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BankBalanceViewModel @Inject constructor(
    private var bankBalanceRepository: BankBalanceRepository
) : ViewModel() {

    fun getBalance() {
        bankBalanceRepository.getBalance()
    }

    fun blockAtmCard() {
        bankBalanceRepository.blockAtmCard()
    }   

    fun getMiniStatement() {
        bankBalanceRepository.getMiniStatement()
    }

}