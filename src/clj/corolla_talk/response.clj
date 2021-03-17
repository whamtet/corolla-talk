(ns corolla-talk.response
  (:require
    [hiccup.page :as page]))

(defn page [& body]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html5 body)})
