package com.example.service

case class Echo() {
  def echo(message: String): Unit = println(message)
}