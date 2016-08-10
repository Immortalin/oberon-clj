(ns oberon-clj.core
  (:require
   ;; [org.bytedeco.javacpp.LLVM :as llvm]
            [instaparse.core :as instaparse])
  (:gen-class))

(def oberon-syntax
  (instaparse/parser (slurp "./resources/oberon-07.ebnf")))

(def test-oberon-syntax []
  (oberon-syntax
   "MODULE Hello;
  IMPORT Oberon, Texts;
  VAR W: Texts.Writer;

  PROCEDURE World*;
  BEGIN
    Texts.WriteString(W, \"Hello World!\");
    Texts.WriteLn(W);
    Texts.Append(Oberon.Log, W.buf);
  END World;

BEGIN
  Texts.OpenWriter(W);
END Hello
"))
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
