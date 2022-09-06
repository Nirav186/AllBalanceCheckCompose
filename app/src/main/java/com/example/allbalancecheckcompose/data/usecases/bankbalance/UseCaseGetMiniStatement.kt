package com.example.allbalancecheckcompose.data.usecases.bankbalance

import android.content.Intent
import android.net.Uri
import com.example.allbalancecheckcompose.AllBalanceCheck
import com.example.allbalancecheckcompose.utils.getMiniStatementNo

class UseCaseGetMiniStatement {

    operator fun invoke() {
        if (AllBalanceCheck.appContext.getMiniStatementNo() == (-1).toLong()) {
            return
        }
        try {
            val intent = Intent(
                Intent.ACTION_CALL,
                Uri.parse("tel:" + AllBalanceCheck.appContext.getMiniStatementNo())
            )
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            AllBalanceCheck.appContext.startActivity(intent)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}