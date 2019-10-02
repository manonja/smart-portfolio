package org.smartportfolio.actors

import akka.actor._

class ProjectInformer(user: Int) extends Actor {
  import org.smartportfolio.messages.ProjectInformer._
  def receive: PartialFunction[Any, Unit] = {
    // TODO: fix test
    case GetProject(id) => sender() ! Project(id, "test", 1, "Test", List(Topic(0, "testing")))

  }
}
