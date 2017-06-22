(defproject weather "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.csv "0.1.4"]
                 [clj-http "3.6.1"]
                 [cheshire "5.7.1"]
                 [environ "1.1.0"]]
  :profiles {:uberjar {:uberjar-name "weather.jar"}}
  :main weather.core)


