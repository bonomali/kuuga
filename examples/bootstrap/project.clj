(defproject example "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[ayato_p/kuuga "0.1.0-SNAPSHOT"]
                 [hiccup "2.0.0-alpha1"]
                 [org.clojure/clojure "1.8.0"]
                 [ring "1.6.2"]]
  :main ^:skip-aot example.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
