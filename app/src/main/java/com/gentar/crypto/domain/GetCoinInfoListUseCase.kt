package com.gentar.crypto.domain

class GetCoinInfoListUseCase(
    private val repository: CoinRepository
) {
    operator fun invoke() = repository.getCoinInfolist()
}