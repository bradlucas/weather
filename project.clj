(defproject weather "0.0.1"
  :description "Building A Weather App In Clojure"
  :url "https://github.com/bradlucas/weather"
  :license {:name "Eclipse Public"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.csv "0.1.4"]
                 [clj-http "3.6.1"]
                 [cheshire "5.7.1"]
                 [environ "1.1.0"]]
  :profiles {:uberjar {:uberjar-name "weather.jar"}}
  :main weather.core)


