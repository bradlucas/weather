(ns weather.zipcode
  (:require [clj-http.client :as client]
            [clojure.data.csv :as csv]))


(def zip-data-url 
  "Found data at https://gist.github.com/erichurst/7882666"
  "https://gist.githubusercontent.com/erichurst/7882666/raw/5bdc46db47d9515269ab12ed6fb2850377fd869e/US%20Zip%20Codes%20from%202013%20Government%20Data")

(defn get-zipcode-location
  "Return lat, lng for zipcode"
  [zipcode]
  (let [m (csv/read-csv (:body (client/get zip-data-url)))
        [_ lat lng] (first (filter #(= zipcode (first %)) m))]
    [lat lng]))
