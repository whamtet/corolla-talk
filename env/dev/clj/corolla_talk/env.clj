(ns corolla-talk.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [corolla-talk.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[corolla-talk started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[corolla-talk has shut down successfully]=-"))
   :middleware wrap-dev})
