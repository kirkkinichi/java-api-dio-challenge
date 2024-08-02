# Desafio DIO - Java RESTful API
Construção de uma API REST utilizando Java 17, Spring Boot 3, Spring Data JPA e OpenAPI.

### Diagrama de Classes

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
