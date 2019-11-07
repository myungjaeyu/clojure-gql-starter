(ns clojure-gql-starter.graphql.resolver.core
  (:require [clojure.core.match :refer [match]]))

(defn resolver-fn [type-name field-name]
  (match [type-name field-name]
    ["QueryRoot" "user"] (fn [context parent args]
                           {:id 1 :name "myungjaeyu"})
    :else nil))