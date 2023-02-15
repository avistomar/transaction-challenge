package nl.rabobank.transaction

import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "transactions")
class TransactionEntity(
    @Id
    val id: Long? = null,
    val fromAccount: String,
    val toAccount: String,
    val description: String,
    val amount: BigDecimal
)