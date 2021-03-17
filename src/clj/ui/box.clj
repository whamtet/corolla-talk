(ns ui.box
  (:require
    [corolla-talk.css :refer [defcss]]
    [ctmx.core :as ctmx]))

(defcss box-style "src-css/ui/components/v2/Box/Box.css")

(ctmx/defn-assets ^{:css box-style} box
  [{:keys [container class]} & children]
  [(or container "div")
   (when class {:class class})
   children])
