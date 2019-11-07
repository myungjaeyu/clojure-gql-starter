(ns clojure-gql-starter.graphql.resolver.core
  (:require [clojure.core.match :refer [match]]
            [clojure-gql-starter.service.user :refer [gets-user get-user create-user]]))

(defn resolver-fn [type-name field-name]
  (match [type-name field-name]
    ["QueryRoot" "users"] (fn [context parent args]
                            (gets-user))
    ["QueryRoot" "user"] (fn [context parent args]
                           (get-user (str (get args "id"))))
    ["Mutation" "createUser"] (fn [context parent args]
                           (create-user (str (get args "name"))))    
    :else nil))