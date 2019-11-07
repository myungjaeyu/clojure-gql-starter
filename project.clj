(defproject clojure-gql-starter "0.1.0-SNAPSHOT"
  :main clojure-gql-starter.core
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [http-kit "2.3.0"]
                 [compojure "1.6.1"]
                 [ring "1.7.1"]
                 [ring/ring-json "0.5.0"]
                 [ring-cors "0.1.13"]
                 [toucan "1.12.0"]
                 [org.postgresql/postgresql "42.2.5"]
                 [graphql-clj "0.2.6"]
                 [environ "1.1.0"]]
  :profiles {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]]}})