(ns clojure-gql-starter.routes.core
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.route :refer [not-found]]
            [ring.util.response :refer [response]]))

(defroutes routes
  (GET "/graphql" []
    (response {:message "index"}))
  (not-found (response {:message "not found"})))