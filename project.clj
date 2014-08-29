(defproject cljs-localhost-issue "0.1.0-SNAPSHOT"
  :description "Something that does something."
  :url "http://yoururl.com"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]]

  :profiles
  {:dev
   {:plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]
              [com.cemerick/clojurescript.test "0.3.1"]]

    :dependencies [[com.cemerick/clojurescript.test "0.3.1"]]

    :cljsbuild {:builds
                [{:id "tests"
                  :source-paths ["src" "test"]
                  :compiler {:output-to "target/tests.js"
                             :optimizations :advanced
                             :pretty-print true}}]
                :test-commands
                {"unit-tests"
                 ["phantomjs" :runner
                  "window.literal_js_executed=true"
                  "test/cljs_localhost_issue/vendor/es5-shim.js"
                  "test/cljs_localhost_issue/vendor/es5-sham.js"
                  "test/cljs_localhost_issue/vendor/console-polyfill.js"
                  "target/tests.js"]}}}})
