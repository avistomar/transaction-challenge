package nl.rabobank.transaction

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class TransactionApplication

fun main(args: Array<String>) {
    runApplication<TransactionApplication>(*args)
}