## Transaction Challenge


Rabobank needs a new microservice for transferring money from one account to another, view transactions that have already been made or view a single transaction.   
Your challenge is to build this system.
The service needs to be written in Spring Boot using Kotlin. 
You can use Spring Data for as the ORM, and H2 as an in-memory database.

As you’ll be part of a team, your teammates have already created a basic repository for you.

Specifications:

```
GET /transactions should fetch all transactions that the user initiated and received

GET /transactions/{id} should fetch a single transaction

POST /transactions should transfer money from one account to another
```


A transaction consists of:


- id: auto incrementing integer
- fromAccount: string of the account IBAN
- toAccount: string of the account IBAN
- description: a text description of the transaction
- amount: integer representation of the amount in cents


We will monitor:

- How you approach coding in general

- How you approach tests

- Your Spring Boot knowledge level

- Your problem-solving skills



Good luck! 