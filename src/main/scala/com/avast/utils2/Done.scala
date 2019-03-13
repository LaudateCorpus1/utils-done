package com.avast.utils2

/** Marker type that can be used instead of `Unit` to convey more information
  * and prevent certain class of bugs (automatic conversion of any value to `Unit`).
  *
  * Inspired by `akka.Done`.
  */
sealed trait Done

case object Done extends Done {
  def apply(): Done = this
}
