(ns clojure-gql-starter.graphql.schema.core)

(def schema-str "
  type User {
    id: Int
    name: String
  }

  type QueryRoot {
    user: User
  }

  schema {
    query: QueryRoot
  }")