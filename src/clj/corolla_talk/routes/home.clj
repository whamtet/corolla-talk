(ns corolla-talk.routes.home
  (:require
    [corolla-talk.response :as response]
    [ctmx.core :as ctmx]
    ui.box))

(ctmx/defcomponent home [req]
  (ui.box/box {:class "foo"} "contents"))

(defn home-routes []
  (ctmx/make-routes
    "/"
    (response/root-handler home)))
