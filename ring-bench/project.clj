(defproject ring/ring-bench "1.14.1"
  :description "Ring core libraries."
  :url "https://github.com/ring-clojure/ring"
  :scm {:dir ".."}
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [jmh-clojure "0.4.0"]
                 [ring/ring-jetty-adapter "1.14.1"]
                 [ring/ring-servlet "1.14.1"]]
  :jvm-opts {}
  :main ring.bench.servlet)
