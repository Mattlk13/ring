(defproject ring/ring-jetty-adapter "1.15.0-beta1"
  :description "Ring Jetty adapter."
  :url "https://github.com/ring-clojure/ring"
  :scm {:dir ".."}
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies
  [[org.clojure/clojure "1.9.0"]
   [ring/ring-core "1.15.0-beta1"]
   [org.ring-clojure/ring-jakarta-servlet "1.15.0-beta1"]
   [org.eclipse.jetty/jetty-server "12.0.21"]
   [org.eclipse.jetty/jetty-unixdomain-server "12.0.21"]
   [org.eclipse.jetty.ee9/jetty-ee9-servlet "12.0.21"]
   [org.eclipse.jetty.ee9.websocket/jetty-ee9-websocket-jetty-server "12.0.21"]]
  :aliases {"test-all" ["with-profile" "default:+1.10:+1.11:+1.12" "test"]}
  :profiles
  {:dev  {:dependencies [[clj-http "3.13.0"]
                         [less-awful-ssl "1.0.7"]
                         [hato "1.0.0"]]
          :jvm-opts ["-Dorg.eclipse.jetty.server.HttpChannelState.DEFAULT_TIMEOUT=500"]}
   :test {:dependencies [[org.eclipse.jetty/jetty-client "12.0.21"]]}
   :1.10 {:dependencies [[org.clojure/clojure "1.10.3"]]}
   :1.11 {:dependencies [[org.clojure/clojure "1.11.4"]]}
   :1.12 {:dependencies [[org.clojure/clojure "1.12.1"]]}})
