package org.smartportfolio.messages

object PortfolioInformer {
  case object Portfolio // get all projects in a portfolio
  case class GetProjects(user: Int)
}
