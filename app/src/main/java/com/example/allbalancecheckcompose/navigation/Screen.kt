package com.example.allbalancecheckcompose.navigation

sealed class Screen(val route: String) {
    object BankSelectionScreen : Screen("bank_selection_screen")
    object HomeScreen : Screen("home_screen")
    object BankBalanceScreen : Screen("bank_balance_screen")
}