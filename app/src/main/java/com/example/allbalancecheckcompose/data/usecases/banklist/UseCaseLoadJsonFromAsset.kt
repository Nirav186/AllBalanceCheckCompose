package com.example.allbalancecheckcompose.data.usecases.banklist

import com.example.allbalancecheckcompose.AllBalanceCheck
import java.io.IOException
import java.io.InputStream

class UseCaseLoadJsonFromAsset {

    operator fun invoke(): String? {
        val json: String?
        try {
            val `is`: InputStream =
                AllBalanceCheck.appContext.assets.open("bank_database.json")
            val size: Int = `is`.available()
            val buffer = ByteArray(size)
            `is`.read(buffer)
            `is`.close()
            json = String(buffer, Charsets.UTF_8)
        } catch (ex: IOException) {
            ex.printStackTrace()
            return null
        }
        return json
    }

}