## Transaction Challenge


Rabobank needs a new microservice for transferring money from one account to another, view transactions that have already been made or view a single transaction.   
Your challenge is to build this system.
As you’ll be part of a team, your teammates have already created a basic repository for you.
The service needs to be written in Spring Boot using Kotlin.
It calls external APIs to retrieve the data. For the purpose of this assignment you can call some dummy
endpoints & stub the response as below for tests. You can also use this object to map the data to your domain.
```
External transaction object
{
  "id": 123,
  "originAccount": "Originator",
  "destinationAccount": "Destination",
  "notes": "description",
  "amount": "25.73"
}

External API spec

GET /dummy/123 Returns the object above
GET /dummy Returns an array of the object above
POST /dummy Returns success/failure http status with empty body
```


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
- amount: amount with up to 2 decimal digits


We will monitor:

- How you approach coding in general

- How you approach tests

- Your Spring Boot knowledge level

- Your problem-solving skills



Good luck! 