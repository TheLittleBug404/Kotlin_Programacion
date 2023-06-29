package com.example.androidmaster
//estas son simplemente funciones para kotlin como las de la suma resta etc
fun suma(){
    val age:Int = 32
    var age2:Int = 33
    println("La suma sera: ")
    println(age+age2)
}
fun restar(){
    var valor1 = 4
    var valor2 = 2
    println("la resta sera: ")
    println(valor1-valor2)
}
fun multiplicacion(a:Int, b:Int){
    println("La multiplicacion sera: ")
    println(a*b)
}
fun division(a:Int, b:Int){
    println("La division sera: ")
    println(a/b)
}
fun modulo(a:Double, b:Double){
    println("El modulo de la division sera de: ")
    println(a%b)
}
fun main(){
    suma()
    restar()
    multiplicacion(5,6)
    division(15,3)
    modulo(16.0,3.0)
}