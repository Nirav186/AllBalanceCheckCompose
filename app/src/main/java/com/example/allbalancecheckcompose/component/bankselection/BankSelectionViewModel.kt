package com.example.allbalancecheckcompose.component.bankselection

import androidx.lifecycle.ViewModel
import com.example.allbalancecheckcompose.data.model.BankDetail
import com.example.allbalancecheckcompose.data.model.BankObject
import com.example.allbalancecheckcompose.domain.repository.BankSelectionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BankSelectionViewModel @Inject constructor(
    private val bankSelectionRepository: BankSelectionRepository
) : ViewModel() {

    fun loadJSONFromAsset(): String? {
        return bankSelectionRepository.loadJSONFromAsset()
    }

    fun generateListFromMap(
        groupedHashMap: Map<String, List<BankDetail>>
    ): List<BankObject> {
        return bankSelectionRepository.generateListFromMap(groupedHashMap)
    }

}