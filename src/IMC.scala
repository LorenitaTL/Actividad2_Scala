import scala.io.StdIn._

object IMC {
  def datos(): String={
  println("Ingresa tu estatura en metros")
  val e = readDouble()
  println("Ingresa tu peso")
  val p = readDouble()
  calcularIMC(e, p)
  }
  
  def calcularIMC(e: Double, p: Double):String={
    val imc = p/(e*e)
    if (imc<16)"IMC: "+imc+" \nDebes acudir a un hospital"
    else if(imc>=16&&imc<17)"IMC: "+imc+" \nInfrapeso"
    else if(imc>=17&&imc<18)"IMC: "+imc+" \nBajo peso"
    else if(imc>=18&&imc<25)"IMC: "+imc+" \nPeso normal (saludable)"
    else if(imc>=25&&imc<30)"IMC: "+imc+" \nSobrepeso (obesidad de grado I)"
    else if(imc>=30&&imc<35)"IMC: "+imc+" \nSobrepeso cronico(obesidad de grado II)"
    else if(imc>=35&&imc<40)"IMC: "+imc+" \nObesidad premorbida (obesidad de grado III)"
    else if(imc>=40)"IMC: "+imc+" \nObesidad mórbida (obesidad de grado IV)"
    else "Error en ls medidas ingresadas"
  }
  def main(args: Array[String]): Unit = {
    println(datos())
  }
}