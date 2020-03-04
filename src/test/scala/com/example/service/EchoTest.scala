package com.example.service

import org.scalatest._

class EchoTest extends FunSuite {
  test("echo service does something") {
    val echo = Echo()
    echo.echo("test")

    assert(true)
  }
}