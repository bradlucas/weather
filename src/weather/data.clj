(ns weather.data
  (:require [clj-http.client :as client]
            [weather.zipcode :as zip]
            [cheshire.core :as cheshire :refer [parse-string]]
            [environ.core :refer [env]]))


(def darksky-key 
  "Configure your DarkSky key as an environment variable"
  (env :darksky-key))

(defn get-weather-data 
  "Contact darksky for the data" 
  [lat lng]
  (let [url (format "https://api.darksky.net/forecast/%s/%s,%s" darksky-key lat lng)]
    (client/get url)))

(defn weather-report [zipcode]
  "Return a report for the weather data"
  (let [[lat lng] (zip/get-zipcode-location zipcode)
        m (cheshire/parse-string (:body (get-weather-data lat lng)))]
    (let [timezone (get m "timezone")
          current (get-in m ["currently" "summary"])
          soon (get-in m ["hourly" "summary"])
          later (get-in m ["daily" "summary"])]
      [timezone current soon later])))

