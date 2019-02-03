import scala.io.StdIn._

object Area_Perimetro {
  /*1. Crear un programa que le muestre al usuario un menu para calcular el area y perimetros 
   * de tres figuras (Circulo, Triangulo y Rectangulo) deacuerdo a la opcion elegida pedir al 
   * usuairo si desea AREA o PERIMETRO, solicitar los datos necesarios para realizar dicho 
   * calculo y mostrar el resultado
   * Crear funciones por separado para los calculos y el menu.*/
  def usuarioMenu():Double={
    println("Selecciona la figura de la que desees obtener su área o perímetro")
    println("1: Circulo")
    println("2: Triangulo")
    println("3: Rectangulo")
    val opcion = readInt()
    
    println("¿Deseas calcular área (oprime 1) o perímetro (oprime 2)?")
    val valor = readInt()
    
   if(opcion==1) circulo(valor) 
   else if(opcion==2) triangulo(valor) 
   else rectangulo(valor) 
   //else println("La opción no es correcta"); 0.0
    
  }
  def circulo(ap : Int): Double={
    println("Ingresa el diametro del circulo")
    val diametro = readDouble()
    if(ap==1){
      print("Area: ")
      Math.PI*((diametro/2)*(diametro/2))
    }
    else if(ap==2){
      println("Perimetro"); Math.PI*diametro
    }else 0
  }
  def triangulo(ap : Int): Double={    
    if(ap==1){
      println("Ingresa medida de la base")
      val base = readDouble()
      println("Ingresa medida de la altura")
      val altura = readDouble()
      print("Area: ")
      (base*altura)/2
    }
    else if(ap==2){
      println("Ingresa medida del lado 1")
      val l1 = readDouble()
      println("Ingresa medida del lado 2")
      val l2 = readDouble()
      println("Ingresa medida del lado 3")
      val l3 = readDouble()
      println("Perimetro: ") 
      l1+l2+l3
    }else 0
  }
  def rectangulo(ap : Int): Double={
      println("Ingresa medida de la base")
      val base = readDouble()
      println("Ingresa medida de la altura")
      val altura = readDouble()
    if(ap==1){
      print("Area: ")
      (base*altura)/2
    }
    else if(ap==2){
      println("Perimetro: ") 
      (base*altura)*2
    }else 0
  }
  
  def main(args: Array[String]): Unit = {
    println(usuarioMenu())
  }
}