# get-dart-score

A Clojure solotion for the payvision codefigt of may 2018

## Usage

leint test


## Let's Play Darts
Ceate your own mechanical dartboard that gives back your score based on the coordinates of your dart.

Task:

Use the scoring rules for a standard dartboard:



Possible scores are:

    Outside of the board: "X"
    Bull's eye: "DB"
    Bull: "SB"
    A single number, example: "10"
    A triple number: "T10"
    A double number: "D10"

A throw that ends exactly on the border of two sections results in a bounce out. You can ignore this because all the given coordinates of the tests are within the sections.

The diameters of the circles on the dartboard are:

    Bull's eye: 12.70 mm
    Bull: 31.8 mm
    Triple ring inner circle: 198 mm
    Triple ring outer circle: 214 mm
    Double ring inner circle: 324 mm
    Double ring outer circle: 340 mm

  [execution time limit] 16 seconds (clj)

  [input] float x

  The coordinates are (x, y) are always relative to the center of the board (0, 0). The unit is millimeters

  [input] float y

  The coordinates are (x, y) are always relative to the center of the board (0, 0). The unit is millimeters

  [output] string
