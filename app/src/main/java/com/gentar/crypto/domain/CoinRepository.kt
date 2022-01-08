package com.gentar.crypto.domain

import androidx.lifecycle.LiveData

interface CoinRepository {

    fun getCoinInfolist(): LiveData<List<CoinInfo>>

    fun getCoinInfo(fromSymbol: String): LiveData<CoinInfo>

    suspend fun loadData()
}