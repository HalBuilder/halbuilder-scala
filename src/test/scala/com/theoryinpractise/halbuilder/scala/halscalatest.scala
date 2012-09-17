package com.theoryinpractise.halbuilder.scala

import org.junit._
import com.theoryinpractise.halbuilder.DefaultRepresentationFactory
import com.theoryinpractise.halbuilder.api.RepresentationFactory
import com.theoryinpractise.halbuilder.scala.HalImplicits._

@Test
class HalScalaTest {

  @Test
  def testHal() = {

    val rf = new DefaultRepresentationFactory()
    val resource = rf.newRepresentation()
    val json = resource.withProperty("name", "mark").renderContent(RepresentationFactory.HAL_JSON)

    println(json)

    val name = resource.tryValue("name").getOrElse("[unknown]")
    println(s"Name is $name")

  }

}
