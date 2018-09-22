class Hello {

  def sayHello(name: String = "Surendra") = {
    "Hello " + name
  }

  def printHello(name: String = "Surendra") = {
    println(sayHello(name))
  }

}
