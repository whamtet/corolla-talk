(ns corolla-talk.css
  (:require
    [clojure.string :as string]))

(defn prepend-class [s prefix]
  (string/replace s #"\.(\S+)" (format ".%s-$1" prefix)))
(defn- css-name [src]
  (-> src (.split "/") last (.split "\\.") first))

(defmacro defcss [sym src]
  `(def ~sym ~(-> src slurp (prepend-class (css-name src)))))
