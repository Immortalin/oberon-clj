(defproject oberon-clj "0.1.0-SNAPSHOT"
  :description "An Oberon Compiler Written in Clojure"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [instaparse "1.4.3"]
                 [org.clojure/tools.macro "0.1.2"]
                 [gui-diff "0.6.7"]
                 ;; [org.bytedeco.javacpp-presets/llvm "3.8.0-1.2"]
                 ]
  :main ^:skip-aot oberon-clj.core
  :target-path "target/%s"
  :plugins [[nightlight/lein-nightlight "1.0.1"]]
  :profiles {:uberjar {:aot :all}})
