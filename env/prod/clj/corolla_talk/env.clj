(ns corolla-talk.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[corolla-talk started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[corolla-talk has shut down successfully]=-"))
   :middleware identity})
