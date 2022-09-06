package com.example.allbalancecheckcompose.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.allbalancecheckcompose.component.bankbalance.BankBalanceScreen
import com.example.allbalancecheckcompose.component.bankbalance.BankBalanceViewModel
import com.example.allbalancecheckcompose.component.bankselection.BankSelectionScreen
import com.example.allbalancecheckcompose.component.bankselection.BankSelectionViewModel
import com.example.allbalancecheckcompose.component.dashboard.DashBoard

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.BankSelectionScreen.route) {
        composable(route = Screen.BankSelectionScreen.route) {
            val viewModel = hiltViewModel<BankSelectionViewModel>()
            BankSelectionScreen(navController = navController, mViewModel = viewModel)
        }
        composable(route = Screen.HomeScreen.route) {
            DashBoard(navController = navController)
        }
        composable(route = Screen.BankBalanceScreen.route) {
            val viewModel = hiltViewModel<BankBalanceViewModel>()
            BankBalanceScreen(navController = navController, viewModel)
        }
    }
}