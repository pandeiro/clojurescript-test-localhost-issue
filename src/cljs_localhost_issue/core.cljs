(ns cljs-localhost-issue.core)

(defn set-local! [k v]
  (.setItem js/localStorage (name k) (if (string? v) v (pr-str v))))

(defn get-local [k]
  (.getItem js/localStorage (name k)))



