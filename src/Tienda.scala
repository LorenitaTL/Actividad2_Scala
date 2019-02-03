import scala.io.StdIn._

object Tienda {
  
  def pantalones(): Double={
    println("Ingresa el número de pantalones que deseas comprar")
    val pantalones = readInt()
    
    descuento(pantalones)
  }
  def descuento(pantalones: Int):Double={
    if(pantalones>=1&&pantalones<5)356.82*pantalones
    else if(pantalones>=5&&pantalones<12) (356.82*.85)*pantalones
    else if(pantalones>=12)(356.82*.70)*pantalones
    else 0
    }
  
  def main (args: Array[String]): Unit = {
    val total =pantalones();
    if(total!=0)println("Total a pagar: "+total)
    else println("El número de pantalones es incorrecto")

  }
  
}