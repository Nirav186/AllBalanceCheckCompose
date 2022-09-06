package com.example.allbalancecheckcompose.component.bankbalance.activity

import android.Manifest
import android.content.pm.PackageManager
import androidx.activity.viewModels
import androidx.core.app.ActivityCompat
import com.example.allbalancecheckcompose.component.bankbalance.BankBalanceViewModel
import com.example.allbalancecheckcompose.component.base.ActBase
import com.example.allbalancecheckcompose.databinding.ActivityBankBalanceBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BankBalanceActivity : ActBase<ActivityBankBalanceBinding>() {

    private val mViewModel: BankBalanceViewModel by viewModels()

    override fun setViewBinding() = ActivityBankBalanceBinding.inflate(layoutInflater)

    override fun bindObjects() {

    }

    override fun bindListeners() {

        binding.iconBack.setOnClickListener { onBackPressed() }

        binding.cardBankBalance.setOnClickListener { performAction(0) }

        binding.cardBlockATMCard.setOnClickListener { performAction(1) }

        binding.cardMiniStatement.setOnClickListener { performAction(2) }
    }

    override fun bindViewModel() {

    }

    override fun bindMethods() {

    }

    private fun performAction(action: Int) {
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), action)
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

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (grantResults.isNotEmpty()) {
            performAction(requestCode)
        }
    }

}