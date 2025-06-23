package com.codewithfk.expensetracker.android.data

import androidx.room.*
import java.time.LocalDate

@Entity
data class Property(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val address: String
)

@Entity
data class Tenant(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val phone: String?,
    val email: String?,
    val propertyId: Long
)

@Entity
data class Rent(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val propertyId: Long,
    val tenantId: Long?,
    val plannedAmount: Double,
    val plannedDate: LocalDate,
    val paid: Boolean = false,
    val paidDate: LocalDate? = null,
    val paymentMethod: String? = null // "Cash" or "Bank"
)

@Entity
data class Loan(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val propertyId: Long,
    val bank: String,
    val amountDue: Double,
    val dueDate: LocalDate,
    val repeatMonthly: Boolean = true
)
