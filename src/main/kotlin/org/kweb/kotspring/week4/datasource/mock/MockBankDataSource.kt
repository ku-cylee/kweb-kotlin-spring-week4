package org.kweb.kotspring.week4.datasource.mock

import org.kweb.kotspring.week4.datasource.BankDataSource
import org.kweb.kotspring.week4.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank("1234", 3.14, 17),
        Bank("1010", 17.0, 0),
        Bank("5678", 0.0, 100),
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}
