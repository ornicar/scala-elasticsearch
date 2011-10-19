package com.github.ornicar.elasticsearch.test

import org.scalatest._
import com.github.ornicar.elasticsearch._

class ElasticsearchTest extends FunSuite {

  test("Instanciate a client without configuration") {
    val es = new Elasticsearch
  }
}
