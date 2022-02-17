package college

class student {
  def studentmethod(){}
}

object Main
{
  def main(args: Array[String]): Unit ={
    val stu = new student()
    val fac = new faculty()

    import bb.geek
    val obj = new geek()
    obj.method();

    import bb.clases.lista
    val objList = new lista()
    objList.method();
  }
}
