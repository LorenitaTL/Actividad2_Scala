import scala.io.StdIn._

object Calificaciones {
  def lectura() : String ={
    println("Ingresa la calificación 1")
    val c1 = readDouble
    println("Ingresa la calificación 2")
    val c2 = readDouble
    println("Ingresa la calificación 3")
    val c3 = readDouble
    println("Ingresa la calificación 4")
    val c4 = readDouble
    println("Ingresa la calificación 5")
    val c5 = readDouble
    resultado(c1, c2, c3, c4, c5)

    }
  def resultado(c1: Double,c2: Double,c3: Double,c4: Double, c5: Double): String={
    val res = (c1+c2+c3+c4+c5)/5;
    if(res>90&&res<=100)"Excelente" 
    else if(res>80&&res<90)"Bien" 
    else if(res>70&&res<80)"regular" 
    else if(res<70) "Terrible"
    else"ERROR! No existe esa calificacion"
  }
  def main(args: Array[String]): Unit = {
    println(lectura())
  }
}