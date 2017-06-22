(ns weather.core
 (:require [weather.data :as data])
 (:gen-class))


(defn -main 
  "Accept a zipcode on the command line and produce a weather report ensure single argument" 
  [& args]
  (if args
    (let [zipcode (first args)]
      (let [[current soon later] (data/weather-report zipcode)]
        (println (format "Zipcode  : %s" zipcode))
        (println (format "Current  : %s" current))
        (println (format "Soon     : %s" soon))
        (println (format "Later    : %s" later))))
    (println "Usage: weather ZIPCODE")))

