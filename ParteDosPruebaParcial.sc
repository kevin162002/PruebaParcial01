def myMethod(datos: List[Double]): Double = {

  val logs: List[Double] = datos.map(d => math.log(d))

  val promedioLog: Double = logs.sum / logs.size

  val sumaCuadrados: Double = logs
    .map(l => {
      val diferencia = l - promedioLog
      diferencia * diferencia
    })
    .sum

  val resultado: Double = math.sqrt(sumaCuadrados / logs.size)

  resultado
}

// Pregunta 2
def ajustarPrecios(precios: List[Double], politica: Double => Double): List[Double] = {
  precios.map(precio => politica(precio))
}

val impuesto12: Double => Double = precio => precio * 1.12
val descuento20: Double => Double = precio => precio * 0.80
val incremento5: Double => Double = precio => precio + 5

val estrategiaEspecial: Double => Double = precio => math.sqrt(precio) * 10
val precios = List(10.0, 20.0, 30.0)

val preciosConImpuesto   = ajustarPrecios(precios, impuesto12)
val preciosConDescuento  = ajustarPrecios(precios, descuento20)
val preciosConIncremento = ajustarPrecios(precios, incremento5)
val preciosConEstrategia = ajustarPrecios(precios, estrategiaEspecial)

// Pregunta 3

def generadorIncrementador(incremento: Int): Int => Int = {
  (x: Int) => x + incremento
}

val sumar5 = generadorIncrementador(5)
val resultado1 = sumar5(10)
val resultado2 = sumar5(20)   

val sumar12 = generadorIncrementador(12)
val r1 = sumar12(3)
val r2 = sumar12(8)



