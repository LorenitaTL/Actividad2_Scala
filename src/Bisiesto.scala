import scala.io.StdIn._

object Bisiesto {
  def anio(){
    println("Ingresa el anio")
    val a = readInt()
    if(bisiesto(a))println("Bisiesto")
    else println("No bisiesto")
  }
  
  def bisiesto(a: Int): Boolean={
    if(a % 4 == 0){//Si es divisible /4 -> continua
      if(a%100!=0){//Si no es divisible /100 es bisiesto
        true
      }
      else{ //Si es divisible /100 -> continua
        if(a%400!=0){//Si no es divisible entre 400 no es bisiesto
          false
        }else true //Si es divisible / 400 si es bisiesto
        }
      }
    else false //Si no es divisible /4 no es bisiesto
  }
  
  
  def main(args: Array[String]):Unit={
   anio() 
  }
}