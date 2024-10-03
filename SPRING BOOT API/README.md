classDiagram
    class User {
        +String name
    }
    
    class Account {
        +String accountNumber
        +String accountAgency
        +float accountBalance
        +float accountLimit
    }
    
    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +float limit
    }
    
    class News {
        +String icon
        +String description
    }
    
    User --> Account
    User --> Feature
    User --> Card
    User --> News
