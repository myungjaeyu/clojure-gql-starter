(ns clojure-gql-starter.routes.core
  (:require [compojure.core :refer [defroutes GET POST]]
            [compojure.route :refer [not-found]]
            [ring.util.response :refer [response]]
            [clojure-gql-starter.graphql.core :refer [execute]]))

(defroutes routes
  (GET "/graphql" [query]
    (println "GET query, " query)
    (response (execute query)))
  (POST "/graphql" [query]
    (println "POST query, " query)
    (response (execute query)))
  (not-found (response {:message "not found"})))