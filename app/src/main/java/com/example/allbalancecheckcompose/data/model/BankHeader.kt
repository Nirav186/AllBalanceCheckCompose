package com.example.allbalancecheckcompose.data.model

data class BankHeader(
    var bankTypeHeaderText: String
): BankObject(){
    override val type: Int
        get() = TYPE_HEADER
}
