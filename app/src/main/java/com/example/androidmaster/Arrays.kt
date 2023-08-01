package com.example.androidmaster
/**en esta clase veremos los arrays en kotlin
Un array es una secuencia de datos es una estrcutura de datos que nos permite almacenar variarias variables
de forma seguida
*/
fun main() {
    //creamos un array de los dias de la semana
    //el indice sera de 0 a 6
    //el tamaño sera de 7
    val DiasSemana = arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    //Si solamente le colocamos asi nos saldra la direccion de memoria donde esta
    println(DiasSemana)
    println("______________________________________________________________________")
    //accedemos al indice 0 del array
    println(DiasSemana[0])
    println("______________________________________________________________________")
    //imprimimos el tamaño de nuestro array
    println("tamaño del array: "+DiasSemana.size)
    println("______________________________________________________________________")
    //reemplazando valores en un array
    DiasSemana[0] = "Valor reemplazado"
    println(DiasSemana[0])

    //----------Bucles en array
    println("______________________________________________________________________")
    println("Imprimimos todos los elementos del array")
    for (posicion in DiasSemana.indices){
        println(DiasSemana[posicion])
    }
    println("______________________________________________________________________")
    for (i in 0..(DiasSemana.size-1))
        print("["+DiasSemana[i]+"]" )
    println()
    println("______________________________________________________________________")
    for ((posicion,valor) in DiasSemana.withIndex()){
        println("La posiscion $posicion contiene el valor $valor")
    }
}
