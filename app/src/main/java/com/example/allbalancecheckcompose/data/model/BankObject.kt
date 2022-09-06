package com.example.allbalancecheckcompose.data.model

abstract class BankObject {
    abstract val type: Int

    companion object{
        const val TYPE_HEADER = 0
        const val TYPE_BANK = 1
    }
}