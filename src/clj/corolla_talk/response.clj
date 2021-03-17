(ns corolla-talk.response
  (:require
    [clojure.string :as string]
    [ctmx.core :as ctmx]
    [hiccup.page :as page]))

(defn page [& body]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html5 body)})

(defn flatten-css [f]
  (->> f
       ctmx/extract-css
       (map second)
       (string/join "\n")))

(defmacro root-handler [f]
  `(fn [req#]
     (page
       [:head
        [:style
         ~(flatten-css f)]]
       [:body
        (~f req#)])))
