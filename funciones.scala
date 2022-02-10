object FunctionSyntax extends App{
  /*
   * Function compare two Integer numbers
   * @param value1 Int
   * @param value2 Int
   * return Int
   * 1  if value1 > value2
   * 0  if value1 = value2
   * -1 if value1 < value2
   */
  def compareIntegers(value1: Int, value2: Int): Int = if (value1 == value2) 0 else if (value1 > value2) 1 else -1

  def compareIntegersV1(value1: Int, value2: Int): Int = {
    if (value1 == value2) 0 else if (value1 > value2) 1 else -1
  }

  def compareIntegersV2(value1: Int, value2: Int): Int =
    if (value1 == value2) 0 else if (value1 > value2) 1 else -1

  println(compareIntegers(1, 2))
  println(compareIntegersV1(2, 1))
  println(compareIntegersV2(2, 2))

}

/// tipo de parametro vararg tipo de datos tipo lista
/// parametros variables
object ScalaVarargsTests {
  def main(args: Array[String]) {
    printAll("foo","hhh", "dddd", "hhhg"   )
  }

  def printAll(strings: String*) {
    strings.map(println)
  }
}


object Demo_cero {
  def main(args: Array[String]) {
    println(matchTest("two"))
    println(matchTest("test"))
    println(matchTest(1))
  }

  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case _ => "many"
  }
}

object Demo {
  def main(args: Array[String]) {

    case class Person(name: String, age: Int)

    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 00)

    for (person <- List(alice, bob, charlie)  ) {
      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) => println(
          "Age: " + age + " year, name: " + name + "?")
      }
    }
  }

}

/////---- maps
object funMaps {
  def main(args: Array[String]) {
    println( capital0fCountry.get("US") )
    println( capital0fCountry.get("Colombia") )
  }

  val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10)
  val capital0fCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")
}