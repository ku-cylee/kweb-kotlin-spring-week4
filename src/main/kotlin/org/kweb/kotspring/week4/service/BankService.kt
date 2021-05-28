package org.kweb.kotspring.week4.service

import org.kweb.kotspring.week4.model.Bank
import org.kweb.kotspring.week4.datasource.BankDataSource
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
    fun getBank(accountNumber: String) = dataSource.retrieveBank(accountNumber)
    fun addBank(bank: Bank): Bank = dataSource.createBank(bank)
}
