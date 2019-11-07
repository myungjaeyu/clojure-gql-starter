(ns clojure-gql-starter.graphql.schema.core)

(def schema-str "
  type User {
    id: Int
    name: String
  }

  type QueryRoot {
    users: [User]
    user(id: Int): User
  }

  type Mutation {
    createUser(name: String): User
  }

  schema {
    query: QueryRoot
    mutation: Mutation
  }")