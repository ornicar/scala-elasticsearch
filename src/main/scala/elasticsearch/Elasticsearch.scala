package com.github.ornicar.elasticsearch

import org.elasticsearch.common.settings._
import org.elasticsearch.node.Node
import org.elasticsearch.node.NodeBuilder.nodeBuilder
import resource._

class ElasticSearch(
  settings: Settings = ImmutableSettings.settingsBuilder().build
) {

  def index(name: String) = managed(new Index(name, makeNode))

  private def makeNode: Node = nodeBuilder.settings(settings).node
}
