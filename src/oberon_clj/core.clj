(ns oberon-clj.core
  (:require
   ;; [org.bytedeco.javacpp.LLVM :as llvm]
            [instaparse.core :as instaparse])
  (:gen-class))

(def oberon-syntax
  (instaparse/parser (slurp "./resources/oberon-07.ebnf")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
