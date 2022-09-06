package com.example.allbalancecheckcompose.data.model


import com.google.gson.annotations.SerializedName

data class BankDetail(
    @SerializedName("bankBalanceNo")
    val bankBalanceNo: Long = -1,
    @SerializedName("bankName")
    val bankName: String = "",
    @SerializedName("bankType")
    val bankType: String = "",
    @SerializedName("blockAtmCard")
    val blockAtmCard: Long = -1,
    @SerializedName("id")
    val id: Int = -1,
    @SerializedName("miniStatement")
    val miniStatement: Long = -1,
    @SerializedName("url")
    val url: String = ""
) : BankObject() {
    override val type: Int
        get() = TYPE_BANK
}