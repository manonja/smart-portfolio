package org.smartportfolio.actors

import akka.actor.{Actor, ActorRef}
import akka.util.Timeout
import org.smartportfolio.messages.PortfolioInformer._


class PortfolioInformer(implicit timeout: Timeout) extends Actor {
  import org.smartportfolio.messages.ProjectInformer

  def createProjectInformer(user: Int): ActorRef = {
    context.actorOf(ProjectInformer.props(user))
  }

  def receive: PartialFunction[Any, Unit] = {
    case GetProjects(user) =>
      def getProjects = {
        context.children.map {child =>
          self.ask(GetProject(child.path.name))
        }
      }
  }

}
