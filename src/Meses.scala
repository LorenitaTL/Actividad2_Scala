import scala.io.StdIn._

object Meses {
  def mes():Int={
    println("Ingresa el numero del mes")
    val mes = readInt()
    if (mes<1||mes>12){ println("Numero de mes no valido"); 0}
    else dias(mes)
  }
  def dias(mes: Int):Int={
    /*El mes 2 tiene 28 dias
 Los meses 4,6,9 y 11 tienen 30 dias
 Los meses 1,3,5,7,8,10 y 12 tienen 31 dias
 * 
 */
    if(mes==2)28
    else if(mes==4||mes==6||mes==9||mes==11)30
    else 31
  }
  def main(args: Array[String]): Unit={
   println("El mes tiene: " +mes()+" dias")
  }
}