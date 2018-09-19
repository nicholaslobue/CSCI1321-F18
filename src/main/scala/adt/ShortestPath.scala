package adt

object ShortestPath {
  val maze = Array(
    Array(0,-1, 0, 0, 0, 0, 0, 0, 0, 0),
    Array(0,-1, 0,-1, 0, 0, 0, 0, 0, 0),
    Array(0,-1, 0,-1, 0, 0, 0, 0, 0, 0),
    Array(0,-1, 0,-1, 0,-1, 0, 0, 0, 0),
    Array(0, 0, 0, 0, 0,-1, 0, 0, 0, 0),
    Array(0,-1,-1,-1, 0,-1, 0, 0, 0, 0),
    Array(0,-1, 0,-1, 0,-1, 0, 0, 0, 0),
    Array(0,-1, 0, 0, 0, 0, 0, 0, 0, 0),
    Array(0,-1, 0,-1, 0, 0, 0, 0, 0, 0),
    Array(0, 0, 0,-1, 0, 0, 0, 0, 0, 0))
}