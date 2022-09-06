package com.example.allbalancecheckcompose.data.usecases.banklist

import com.example.allbalancecheckcompose.data.model.BankDetail
import com.example.allbalancecheckcompose.data.model.BankHeader
import com.example.allbalancecheckcompose.data.model.BankObject

class UseCaseGenerateListFromMap {

    operator fun invoke(groupedHashMap: Map<String, List<BankDetail>>): List<BankObject>{
        val consolidatedList: MutableList<BankObject> = ArrayList()
        for (bankType in groupedHashMap.keys) {
            val dateItem = BankHeader(bankType)
            consolidatedList.add(dateItem)
            for (bankDetail in groupedHashMap[bankType]!!) {
                consolidatedList.add(bankDetail)
            }
        }
        return consolidatedList
    }

}