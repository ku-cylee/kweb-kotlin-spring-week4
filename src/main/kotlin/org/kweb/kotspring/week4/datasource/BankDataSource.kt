package org.kweb.kotspring.week4.datasource

import org.kweb.kotspring.week4.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
}
