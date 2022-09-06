package com.example.allbalancecheckcompose.domain.repository

import com.example.allbalancecheckcompose.data.model.BankDetail
import com.example.allbalancecheckcompose.data.model.BankObject

interface BankSelectionRepository {

    fun loadJSONFromAsset(): String?
    fun generateListFromMap(
        groupedHashMap: Map<String, List<BankDetail>>
    ): List<BankObject>

}