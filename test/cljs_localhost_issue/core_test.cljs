(ns cljs-localhost-issue.core-test
  (:require-macros
   [cemerick.cljs.test :refer [is deftest with-test run-tests
                               testing test-var done]])
  (:require
   [cemerick.cljs.test :as t]
   [cljs-localhost-issue.core :refer [set-local! get-local]]))

(deftest check
  (testing "sanity"
    (is true)))

(deftest local-storage
  (let [v {:a 1}]
    (set-local! :data v)
    (testing "local storage works"
      (is (= "{:a 1}" (get-local :data))))))

