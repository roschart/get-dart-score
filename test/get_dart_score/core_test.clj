(ns get-dart-score.core-test
  (:require [clojure.test :refer :all]
            [get-dart-score.core :refer :all]))

(deftest codefigt
  (testing "all tests"
    (is (= (GetDartScore -133.69 -147.38)
           "X"))
    (is (= (GetDartScore 4.06 0.71)
           "DB"))
    (is (= (GetDartScore 2.38 -6.06)
           "SB"))
    (is (= (GetDartScore -5.43 117.95)
           "20"))))
