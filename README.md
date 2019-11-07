# clojure-gql-starter

## Usage

Create an `.lein-env` file at the root.
```clj
{:db-type "postgres"
 :db-name "postgres"
 :db-user "postgres"
 :db-host "localhost"
 :db-password "postgres"}
```

```
$ lein run
```

Request URL - `http://localhost:3000/graphql`

## GraphQL Specification

#### Query users

```graphql
query { 
    users { 
        id
        name 
    } 
}
```

- **Response**

```json
[
    {
        "id":1,
        "name":"myungjaeyu"
    }
]
```

#### Query user

```graphql
query {
    user(id: 1) {
        id
        name
    }
}
```

- **Response**

```json
{
    "id":1,
    "name":"myungjaeyu"
}
```

#### Mutation createUser

```graphql
mutation {
    createUser(name: "myungjaeyu") {
        id
        name
    }
}
```

- **Response**

```json
{
    "id":1,
    "name":"myungjaeyu"
}
```