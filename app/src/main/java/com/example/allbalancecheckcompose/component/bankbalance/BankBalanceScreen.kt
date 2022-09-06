@file:OptIn(ExperimentalMaterialApi::class)

package com.example.allbalancecheckcompose.component.bankbalance

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.core.app.ActivityCompat
import androidx.navigation.NavController
import com.example.allbalancecheckcompose.R
import com.example.allbalancecheckcompose.ui.theme.EditTextBgColor
import com.example.allbalancecheckcompose.ui.theme.ToolBarColor

@Composable
fun BankBalanceScreen(
    navController: NavController,
    mViewModel: BankBalanceViewModel
) {
    val context = LocalContext.current
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = {
                Text(text = "Bank Balance")
            },
            navigationIcon = {
                IconButton(onClick = {
                    navController.popBackStack()
                }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Back Btn")
                }
            },
            backgroundColor = ToolBarColor,
            contentColor = Color.White
        )
        Card(
            modifier = Modifier
                .padding(horizontal = 20.dp, vertical = 10.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            elevation = 0.dp,
            backgroundColor = EditTextBgColor,
            onClick = { performAction(0, mViewModel, context) }
        ) {
            Text(
                text = stringResource(id = R.string.bank_balance),
                modifier = Modifier.padding(10.dp),
                textAlign = TextAlign.Center
            )
        }
        Card(
            modifier = Modifier
                .padding(horizontal = 20.dp, vertical = 10.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            elevation = 0.dp,
            backgroundColor = EditTextBgColor,
            onClick = { performAction(1, mViewModel, context) }
        ) {
            Text(
                text = stringResource(id = R.string.text_block_atm_card),
                modifier = Modifier.padding(10.dp),
                textAlign = TextAlign.Center
            )
        }
        Card(
            modifier = Modifier
                .padding(horizontal = 20.dp, vertical = 10.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            elevation = 0.dp,
            backgroundColor = EditTextBgColor,
            onClick = { performAction(2, mViewModel, context) }
        ) {
            Text(
                text = stringResource(id = R.string.text_mini_statement),
                modifier = Modifier.padding(10.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}

private fun performAction(action: Int, mViewModel: BankBalanceViewModel, context: Context) {
    if (ActivityCompat.checkSelfPermission(
            context,
            Manifest.permission.CALL_PHONE
        ) != PackageManager.PERMISSION_GRANTED
    ) {
        ActivityCompat.requestPermissions(
            context as Activity,
            arrayOf(Manifest.permission.CALL_PHONE),
            action
        )
        return
    } else {
        when (action) {
            0 -> {
                mViewModel.getBalance()
            }
            1 -> {
                mViewModel.blockAtmCard()
            }
            2 -> {
                mViewModel.getMiniStatement()
            }
            else -> mViewModel.getBalance()
        }
    }
}