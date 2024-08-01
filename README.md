# Desafio DIO - Java RESTful API

## Diagrama de Classes

```mermaid
classDiagram
    class Person {
        +String name
        +Passport passport
    }

    class Passport {
        +String age
        +String nationality
        +String gender
        +String passportNumber
        +String expiryDate
        +String issuingAuthority
        +String holderSignature
        +String holderPhotograph
        +String controlCode
    }

    Person "1" *-- "1" Passport
