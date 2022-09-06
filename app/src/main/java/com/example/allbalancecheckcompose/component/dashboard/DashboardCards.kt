package com.example.allbalancecheckcompose.component.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.allbalancecheckcompose.R
import com.example.allbalancecheckcompose.navigation.Screen
import com.example.allbalancecheckcompose.ui.theme.*

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun DashBoardCardBankBalance(navController: NavController) {
    val context = LocalContext.current
    val title = "Bank balance"
    val modifier = Modifier
    Card(
        modifier = modifier
            .height(220.dp)
            .width(170.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 0.dp,
        backgroundColor = BankBalanceBgColor,
        onClick = {
            navController.navigate(Screen.BankBalanceScreen.route)
        }
    ) {
        Box(
            modifier = modifier.height(220.dp)
        ) {
            Column(
                modifier = modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_bank_balance),
                    contentDescription = null,
                    modifier = modifier
                        .height(60.dp)
                        .width(60.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = title,
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = BankBalanceTextColor
                )
            }
        }
    }
}

@Preview
@Composable
fun DashBoardCardCalculator() {
    val title = "Calculator"
    val modifier = Modifier
    Card(
        modifier = modifier
            .height(220.dp)
            .width(170.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 0.dp,
        backgroundColor = CalculatorBgColor
    ) {
        Box(
            modifier = modifier
                .height(220.dp)
        ) {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_loan),
                    contentDescription = null,
                    modifier = modifier
                        .height(60.dp)
                        .width(60.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = title,
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = CalculatorTextColor
                )
            }
        }
    }
}

@Preview
@Composable
fun DashBoardCardNetBanking() {
    val title = "Net Banking"
    val modifier = Modifier
    Card(
        modifier = modifier
            .height(220.dp)
            .width(170.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 0.dp,
        backgroundColor = NetBankingBgColor
    ) {
        Box(
            modifier = modifier
                .height(220.dp)
        ) {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_net_banking),
                    contentDescription = null,
                    modifier = modifier
                        .height(60.dp)
                        .width(60.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = title,
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = NetBankingTextColor
                )
            }
        }
    }
}

@Preview
@Composable
fun DashBoardCardRTO() {
    val title = "RTO Vehicle Info"
    val modifier = Modifier
    Card(
        modifier = modifier
            .width(170.dp)
            .height(220.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 0.dp,
        backgroundColor = RtoVehicleInfoBgColor
    ) {
        Box(
            modifier = modifier
                .height(220.dp)
        ) {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_rto),
                    contentDescription = null,
                    modifier = modifier
                        .height(60.dp)
                        .width(60.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = title,
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = RtoVehicleInfoTextColor
                )
            }
        }
    }
}

@Preview
@Composable
fun DashBoardCardFdRd() {
    val title = "FD / RD"
    val modifier = Modifier
    Card(
        modifier = modifier
            .height(220.dp)
            .width(170.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 0.dp,
        backgroundColor = FdRdBgColor
    ) {
        Box(
            modifier = modifier
                .height(220.dp)
        ) {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_fd_rd),
                    contentDescription = null,
                    modifier = modifier
                        .height(60.dp)
                        .width(60.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = title,
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = FdRdTextColor
                )
            }
        }
    }
}

@Preview
@Composable
fun EmptyCard() {
    val modifier = Modifier
    Card(
        modifier = modifier
            .height(220.dp)
            .width(170.dp),
        elevation = 0.dp,
        backgroundColor = Transparent
    ) {}
}

