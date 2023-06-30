package com.example.androidmaster

fun main(){
    ifbasico()
    ifBoolean(false)
}
fun ifbasico(){
    val name = "Ricardo"
    //lower case convierte toda la cadena en minuscula
    //uppercase convierte todo a mayuscula
    if(name.lowercase() == "fernando"){
        println("el if entro por true")
    }else{
        println("el if entro por false")
    }
}
fun ifBoolean(a:Boolean){
    if(a){
        println("Entra por true")
    }else{
        println("Entra por false")
    }
}