package com.example.allbalancecheckcompose.component.bankselection

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.allbalancecheckcompose.R
import com.example.allbalancecheckcompose.data.model.BankDetail
import com.example.allbalancecheckcompose.navigation.Screen
import com.example.allbalancecheckcompose.ui.theme.ToolBarColor
import com.example.allbalancecheckcompose.utils.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException

@Composable
fun BankSelectionScreen(
    navController: NavController,
    mViewModel: BankSelectionViewModel
) {
    val bankList: ArrayList<BankDetail> = Gson().fromJson(
        mViewModel.loadJSONFromAsset().toString(),
        object : TypeToken<ArrayList<BankDetail?>?>() {}.type
    )
    val map = bankList.groupBy { it.bankType }
    Column(
        modifier = Modifier
    ) {
        TopAppBar(
            elevation = 0.dp,
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = ToolBarColor,
            contentColor = Color.White
        ) {
            //Title
            Row(
                Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                ProvideTextStyle(value = MaterialTheme.typography.h6) {
                    CompositionLocalProvider(
                        LocalContentAlpha provides ContentAlpha.high,
                    ) {
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            maxLines = 1,
                            text = "Select Bank"
                        )
                    }
                }
            }
        }
        BankList(navController = navController, bankList = bankList)
    }
}

@Composable
fun BankList(navController: NavController, bankList: ArrayList<BankDetail>) {
    LazyColumn(
        modifier = Modifier
    ) {
        items(bankList) { data ->
            BankItem(navController = navController, bankDetail = data)
        }
    }
}

@Composable
fun BankItem(navController: NavController, bankDetail: BankDetail) {
    val context = LocalContext.current
    Row(
        modifier = Modifier
            .height(70.dp)
            .padding(14.dp)
            .fillMaxWidth()
            .clickable(
                onClick = {
                    context.setBankId(bankDetail.id)
                    context.setBankName(bankDetail.bankName)
                    context.setBankType(bankDetail.bankType)
                    context.setBankBalanceNo(bankDetail.bankBalanceNo)
                    context.setMiniStatementNo(bankDetail.miniStatement)
                    context.setBlockATMNo(bankDetail.blockAtmCard)
                    context.setBankUrl(bankDetail.url)
                    navController.navigate(Screen.HomeScreen.route)
                }
            ),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        val bitmap: Bitmap? = context.assetsToBitmap("${bankDetail.id}.png")

        val imageBitmap = remember {
            mutableStateOf<ImageBitmap?>(null)
        }
        bitmap?.apply {
            imageBitmap.value = this.asImageBitmap()
        }
        imageBitmap.value?.apply {
            Image(
                modifier = Modifier
                    .width(80.dp)
                    .height(40.dp),
                bitmap = this,
                contentDescription = null,
            )
        }
        Spacer(
            modifier = Modifier
                .fillMaxHeight()
                .width(20.dp)
        )
        Text(
            modifier = Modifier.weight(1.0f),
            text = bankDetail.bankName,
            fontSize = 16.sp,
            maxLines = 1
        )
        Image(
            painter = painterResource(id = R.drawable.ic_next),
            contentDescription = null,
            alignment = Alignment.CenterEnd
        )
        Spacer(modifier = Modifier.width(10.dp))
    }
}

// extension function to get bitmap from assets
private fun Context.assetsToBitmap(fileName: String): Bitmap? {
    return try {
        with(assets.open(fileName)) {
            BitmapFactory.decodeStream(this)
        }
    } catch (e: IOException) {
        null
    }
}