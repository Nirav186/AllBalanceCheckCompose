package com.example.allbalancecheckcompose.data.repository.banklist

import com.example.allbalancecheckcompose.data.model.BankDetail
import com.example.allbalancecheckcompose.data.model.BankObject
import com.example.allbalancecheckcompose.data.usecases.banklist.UseCaseGenerateListFromMap
import com.example.allbalancecheckcompose.data.usecases.banklist.UseCaseLoadJsonFromAsset
import com.example.allbalancecheckcompose.domain.repository.BankSelectionRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BankSelectionRepositoryImpl @Inject constructor(
    private var mUseCaseLoadJsonFromAsset: UseCaseLoadJsonFromAsset,
    private var mUseCaseGenerateListFromMap: UseCaseGenerateListFromMap
) : BankSelectionRepository {
    override fun loadJSONFromAsset(): String? {
        return mUseCaseLoadJsonFromAsset.invoke()
    }

    override fun generateListFromMap(groupedHashMap: Map<String, List<BankDetail>>): List<BankObject> {
        return mUseCaseGenerateListFromMap.invoke(groupedHashMap)
    }
}