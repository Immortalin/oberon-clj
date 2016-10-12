(ns oberon-clj.core
  (:require
   ;; [org.bytedeco.javacpp.LLVM :as llvm]
   [instaparse.core :as instaparse])
  (:use [clojure.tools.macro :only (macrolet)])
  (:gen-class))

(def oberon-parser
  (instaparse/parser (slurp "./resources/oberon-07.ebnf") :start :module :auto-whitespace :standard))

(def oberon-test-code
  "Code for testing Oberon parser. Source: http://groups.engin.umd.umich.edu/CIS/course.des/cis400/oberon/hworld.html "
  (macrolet [(compile-time-slurp [file] (slurp file))] ; local macro definition
            (slurp  "./resources/hello_world.mod")))

(def test-oberon-syntax
  "Tests oberon parser, causes Class exception in the case of failure as instaparse failure object cannot be casted into Clojure IFn(I think)"
  (instaparse/parse oberon-parser oberon-test-code))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
