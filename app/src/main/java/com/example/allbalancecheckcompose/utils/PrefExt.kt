package com.example.allbalancecheckcompose.utils

import android.content.Context
import android.content.SharedPreferences

fun Context.getPreferences(): SharedPreferences {
    return getSharedPreferences("AllBalanceCheck", Context.MODE_PRIVATE)
}

fun Context.setBankId(bankId: Int) {
    getPreferences().edit().putInt("bankId", bankId).apply()
}

fun Context.getBankId(): Int {
    return getPreferences().getInt("bankId", -1)
}

fun Context.setBankName(bankName: String) {
    getPreferences().edit().putString("bankName", bankName).apply()
}

fun Context.getBankName(): String {
    return getPreferences().getString("bankName", "").toString()
}

fun Context.setBankType(bankType: String) {
    getPreferences().edit().putString("bankType", bankType).apply()
}

fun Context.getBankType(): String {
    return getPreferences().getString("bankType", "ALL").toString()
}

fun Context.setBankBalanceNo(bankBalanceNo: Long) {
    getPreferences().edit().putLong("bankBalanceNo", bankBalanceNo).apply()
}

fun Context.getBankBalanceNo(): Long {
    return getPreferences().getLong("bankBalanceNo", -1)
}

fun Context.setMiniStatementNo(miniStatement: Long) {
    getPreferences().edit().putLong("miniStatement", miniStatement).apply()
}

fun Context.getMiniStatementNo(): Long {
    return getPreferences().getLong("miniStatement", -1)
}

fun Context.setBlockATMNo(blockAtmCard: Long) {
    getPreferences().edit().putLong("blockAtmCard", blockAtmCard).apply()
}

fun Context.getBlockATMNo(): Long {
    return getPreferences().getLong("blockAtmCard", -1)
}

fun Context.getBankUrl(): String {
    return getPreferences().getString("bankUrl", "").toString()
}

fun Context.setBankUrl(bankUrl: String) {
    getPreferences().edit().putString("bankUrl", bankUrl).apply()
}
