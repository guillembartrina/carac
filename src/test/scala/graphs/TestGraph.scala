package graphs

import datalog.dsl.{Constant, Program, Relation, Term}

import scala.collection.mutable

trait TestGraph {
  val queries: mutable.Map[String, Query]
  val description: String
  def initGraph(program: Program): Unit
}

case class Query(description: String, relation: Relation[Constant], solution: Set[Seq[Term]])