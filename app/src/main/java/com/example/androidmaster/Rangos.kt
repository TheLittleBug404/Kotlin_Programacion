package com.example.androidmaster
//en esta clase veremos los rangos en programacion
//para sacar los rangos en programacion simplemente debemos hacer ..
fun SeriePares(n:Int){
    var par:Int = 2
    for (i in 1..n){
        print("$par ")
        par+=2
    }
    println()
}
//para los rangos solo colocamos
// in numeroEmpiezo .. numeroFinal
fun rangosWhen(n:Int){
    when (n){
        in 1..500 -> println("introduciste un numero del 1 al 500")
        in 501..1000 -> println("Introduciste un numero del 501 al 1000")
        else -> println("No introduciste un numero del 1 al 1000.")
    }
}
fun main(){
    println("Introdusca un numero par la serie de pares: ")
    val pares:Int = readLine()!!.toInt()
    SeriePares(pares)
    println("Introdusca un numero del 1 al 1000")
    val numero:Int = readLine()!!.toInt()
    rangosWhen(numero)
}
