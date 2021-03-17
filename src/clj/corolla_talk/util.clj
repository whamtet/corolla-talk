(ns corolla-talk.util)

(defmacro kw [& syms]
  (zipmap (map keyword syms) syms))
