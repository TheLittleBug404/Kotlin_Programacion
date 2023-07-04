package com.example.androidmaster
fun SaberSiEsPrimo(a:Int):Boolean{
    var c:Int = 0
    for(i in 1..a){
        if(a%i == 0)
            c++
    }
    if(c==2)
        return true
    return false
}
fun funcionPrimos(n:Int){
    var c:Int = 1
    var num:Int = 1
    while(c<=n){
        if(SaberSiEsPrimo(num)){
            c++;
            print(" $num")
        }
        num++
    }
}
fun main(){
    print("\n Introduca su nombre: ")
    val nombre= readLine()
    println("Introdusca un numero para la funcion: ")
    //el !! significa que le estamos haciendo leer si o si la variable int
    //si no le colocamos el !! nos la linea de codigo nos dara error
    var a:Int = readLine()!!.toInt()
    print("\n Hola $nombre la funcion de primos sera: ")
    funcionPrimos(a)
}
