(ns corolla-talk.routes.home
  (:require
    [corolla-talk.response :as response]
    [ctmx.core :as ctmx]
    ui.box))

(defn home-routes []
  (ctmx/make-routes
    "/"
    (fn [req]
      (response/page
        (ui.box/box {:class "foo"} "contents")))))
