import scala.io.StdIn._

object Prestamo {
  def datos(): Boolean={
    println("�Cu�l es tu nombre?")
    val nombre = readLine()
    println("Tu historia crediticia es buena(b) o mala(m)?")
    val historia = readChar()
    println("�Cu�l es el monto del pr�stamo que deseas?")
    val prestamo = readDouble()
    println("�Cu�l es tu salario anual?")
    val salario = readDouble()
    println("�Cu�l es el valor de tus propiedades?")
    val propiedades = readDouble()
    
    if(historia.equals('m')){println("No se te otorgar� el pr�stamo") 
      false
      }
    if(historia.equals('b')){
      if(puntos(salario, prestamo, propiedades)>=6){
        println("Prestamo aprobado")
        true}
      else {
        println("Prestamo denegado")
        false}
      }
    else{println("ERROR!!")
      false}
    

  }
  def puntos(s: Double, pres: Double, prop: Double):Int={
    var puntos =0
    if(s>=(pres*.50)){ 
      puntos=puntos+5
      puntos}
    if(s>=(pres*.25)&&s<(pres*.50)){
      puntos=puntos+3
      puntos}
    if(s>=(pres*.10)&&s<(pres*.25)){
      puntos=puntos+1
      puntos}
    if(prop>=(pres*2)){ 
      puntos=puntos+5
      puntos}
    if(prop>=pres&&prop<(pres*2)){
      puntos=puntos+3
      puntos}
    else 0
    }
  def main (args: Array[String]): Unit={
    println(datos())
  }
}