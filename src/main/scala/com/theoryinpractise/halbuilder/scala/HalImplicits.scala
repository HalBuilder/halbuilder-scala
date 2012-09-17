package com.theoryinpractise.halbuilder.scala

import com.theoryinpractise.halbuilder.api.Representation

object HalImplicits {

  class RichRepresentation(r : Representation) {
    def tryValue(name: String) : Option[Object] = Option(r.getValue(name))
  }

  implicit def RichRepresentation(r: Representation) = new RichRepresentation(r)

}
