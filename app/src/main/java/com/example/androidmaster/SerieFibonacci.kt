package com.example.androidmaster
fun serie(n:Int){
    var a:Int=-1
    var b:Int=1
    var c:Int
    for(i in 1..n){
        c = a+b
        print("$c ")
        a=b
        b=c
    }
}
fun main(){
    print("\n Introdusca su nombre: ")
    val nombre:String = readln()
    print("\n Introdusca la cantidad de elementos de la serie fibonacci: ")
    var a:Int = readLine()!!.toInt()
    println("$nombre la serie fibonacci sera la siguiente: ")
    serie(a)
}