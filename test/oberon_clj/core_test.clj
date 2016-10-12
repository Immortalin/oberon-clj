(ns oberon-clj.core-test
  (:require [clojure.test :refer :all]
            [oberon-clj.core :refer :all]))

(deftest parser-tester
  (testing "Parsing Oberon code"
    (is (test-oberon-syntax))))
