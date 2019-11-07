(ns clojure-gql-starter.graphql.core
  (:require [graphql-clj.executor :as executor]
            [clojure.core.match :refer [match]]))

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
  (match [type-name field-name]
    ["QueryRoot" "user"] (fn [context parent args]
                           {:id 1 :name "myungjaeyu"})
    :else nil))

(defn execute [query]
  (executor/execute nil schema-str resolver-fn query))