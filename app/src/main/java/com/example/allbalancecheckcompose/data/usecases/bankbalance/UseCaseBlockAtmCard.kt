package com.example.allbalancecheckcompose.data.usecases.bankbalance

import android.content.Intent
import android.net.Uri
import com.example.allbalancecheckcompose.AllBalanceCheck
import com.example.allbalancecheckcompose.utils.getBlockATMNo

class UseCaseBlockAtmCard {

    operator fun invoke() {
        if (AllBalanceCheck.appContext.getBlockATMNo() == (-1).toLong()) {
            return
        }
        try {
            val intent = Intent(
                Intent.ACTION_CALL,
                Uri.parse("tel:" + AllBalanceCheck.appContext.getBlockATMNo())
            )
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            AllBalanceCheck.appContext.startActivity(intent)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}