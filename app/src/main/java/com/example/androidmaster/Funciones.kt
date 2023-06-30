package com.example.androidmaster

//en aca veremos las funcioens en kotlin
//funcion de tipo INt
//estas funciones que tienen paramaetros son de tipo
fun variablesNumericas(a:Int, b:Int):Int{
    return a+b
}

fun main(){
    println(variablesNumericas(5,6))
    println(Cadena())
    nombre("Ricardo ")
    valorDefecto()
    //en este caso le mandamos el numero 6 asi que no nos mandara el numero 5
    valorDefecto(6)
}
//funcion de tipo String
//Estas funciones que no tienen parametros son funciones simples
fun Cadena():String{
    return "Hola Ricardo esta es la funcion de tipo String"
}
fun nombre(name:String){
    println("Me llamo $name")
}
//funciones de calores por defecto
//en este caso si no le mandamos un parametro a la funcion, por defecto nos mandara el numero 5
fun valorDefecto(numero:Int = 5){
    println(" El numero mandado por defecto es $numero")
}