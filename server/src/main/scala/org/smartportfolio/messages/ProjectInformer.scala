package org.smartportfolio.messages

import akka.actor.Props
import org.smartportfolio.actors.ProjectInformer

object ProjectInformer {

  def props(user: Int) = Props(new ProjectInformer(user))

  case class GetProject(id: Int) // get project by id

  case class Project(id: Int, name: String, description: String, topics: List[Topic]) // message for a project

  case class Topic(id: Int, name: String) // message for a topic
}
