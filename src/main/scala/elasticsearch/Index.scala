package com.github.ornicar.elasticsearch

import org.elasticsearch.client.Client
import org.elasticsearch.node.Node

class Index(name: String, node: Node)  {

  def client: Client = node.client

  def close() {
    client.close()
    node.close()
  }
}
