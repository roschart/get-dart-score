(ns get-dart-score.core)
(def values
 {0 6
  1 13
  2 4
  3 18
  4 1
  5 20
  6 5
  7 12
  8 9
  9 14
  10 11
  -1 10
  -2 15
  -3 2
  -4 17
  -5 3
  -6 19
  -7 7
  -8 16
  -9 8
  -10 11})

(defn coor-to-polar
  "transform coordinates to polars
  [5 12]-> [13.0 1.1760052070951352]]"
  [x y]
  [(Math/sqrt (+ (* x x) (* y y))) (Math/atan2 y x)])

(defn sector
  "Given an angle give the sector of the dart board
  pi/2 -> 5 or 0 -> 0"
  [rad]
  (let [delta (/ Math/PI 10)] ; 2pi / 20 sectors
    (-> rad
        (+ (/ delta 2))
        (/ delta)
        (Math/floor)
        int)))

(defn angle-to-str-number [angle]
  (str (values (sector angle))))

(defn GetDartScore [x y]
 (let [[r angle] (coor-to-polar x y)]
    (cond
      (<= r (/ 12.70 2)) "DB"
      (<= r (/ 31.8 2)) "SB"
      (<= r (/ 198 2)) (angle-to-str-number angle)
      (<= r (/ 214 2)) (str "T" (angle-to-str-number angle))
      (<= r (/ 324 2)) (angle-to-str-number angle)
      (<= r (/ 340 2)) (str "D" (angle-to-str-number angle))
      :else "X")))
