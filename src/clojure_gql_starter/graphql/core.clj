(ns clojure-gql-starter.graphql.core
  (:require [graphql-clj.executor :as executor]
            [clojure-gql-starter.graphql.schema.core :refer [schema-str]]
            [clojure-gql-starter.graphql.resolver.core :refer [resolver-fn]]))

(defn execute [query]
  (executor/execute nil schema-str resolver-fn query))