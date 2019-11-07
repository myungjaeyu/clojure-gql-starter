(ns clojure-gql-starter.graphql.core
  (:require [graphql-clj.executor :as executor]))

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

(defn resolver-fn [type-name field-name]
  (get-in {"QueryRoot" {"user" (fn [context parent args]
                                 {:id 1 :name "myungjaeyu"})}}
          [type-name field-name]))

(defn execute [query]
  (executor/execute nil schema-str resolver-fn query))