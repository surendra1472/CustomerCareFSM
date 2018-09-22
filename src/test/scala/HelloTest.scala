import org.scalatest.FunSuite

class HelloTest extends FunSuite{
  val hello = new Hello()
  test("Hello.sayHello should return Hello the name") {
    assert(hello.sayHello("Suri") == "Hello Suri")
    assertResult()()
  }
//  test("Hello.printHello should print the name") {
//    assertResult("Hello Suri")(hello.printHello("Suri"))
//  }

}

//extends FlatSpec with Matchers
