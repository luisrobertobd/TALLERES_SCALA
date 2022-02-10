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


object ScalaVarargsTests {
  /*
 * Function printAll  imprime los parametros recibidos
 * @cadena es un parametro Varargs ->  String*  -> permite recibir mas de un elemento
 * return Unit
 * cadena.map aplica la misma funcion  println a todos los elementos
 */
  def main(args: Array[String]) {
    printAll("foo","hhh", "dddd", "hhhg"   )
  }

  def printAll(cadena : String*) {
    cadena.map(println)
  }
}


object Demo_cero {
  /*
****PATTER MATCHINE CON  variables ******
*/

  def main(args: Array[String]) {
    println(matchTest("two"))
    println(matchTest("test"))
    println(matchTest(1))
  }

  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case _ => "many"  ///   ultima linea opcion de no coincidencia
  }
}

object Demo {
  /* PATTER MATCHINE CON  classes
* CLASE  Person -->  APLICA pattern matchine
* @name  parametro que recibe un string
*  @age  parametro que recibe un int
* return Unit
* cadena.map aplica la misma funcion  println a todos los elementos
*/
  def main(args: Array[String]) {

    case class Person(name: String, age: Int)

    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 00)

    for (person <- List(alice, bob, charlie)  ) {
      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) => println(  ///   ultima linea opcion de no coincidencia
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