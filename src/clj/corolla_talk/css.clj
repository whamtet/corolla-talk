(ns corolla-talk.css
  (:require
    [clojure.string :as string]))

(defn prepend-class [s prefix]
  (string/replace s #"\.(\S+)" (format ".%s-$1" prefix)))
(defn- css-name [src]
  (-> src (.split "/") last (.split "\\.") first))

(defmacro defcss
  ([sym src] `(defcss ~sym ~src false))
  ([sym src prepend-class?]
   (let [s (slurp src)]
     `(def ~sym
        ~(if prepend-class?
           (prepend-class s (css-name src))
           s)))))
