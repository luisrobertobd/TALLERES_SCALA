object square_root_2 {

  def abs = 1
  def cuadrado ( z: Double ) =  z*z

  def sqrt(x: Double) = {


    def abs(x: Double) = if (x < 0) -x else x

    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def isGoodEnough(guess: Double, x: Double) = abs( cuadrado(guess) - x) < 0.01

    def improve(guess: Double, x: Double) = (guess + x / guess) / 2

    sqrtIter(1, x)
  }
}


object calcular_raiz_2 extends App {
  val raiz = square_root_2.sqrt(9)
  println ( "solucion:" + raiz )
}

//@main def test= println (square_root_2.sqrt(9) )