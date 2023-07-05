package com.example.androidmaster
//en kotlin las variables pueden ser nulas solo colocandolas "?"
fun main(){
    /*
    debemos tener mucho cuidado con los null en kotlin por que estos pueden llegar a romper la aplicacion
    hay 2 formas de tratar los null en kotlin la primera es:
    1.- !! con esto le decimos que la variable que estamos declarando no sera null en otras palabras
    estamos seguros que esta variable no sera del nula
    2.- ? con este le decimos que la variable no es nula entonces la aplicacion no se rompe
     */
    //si colocamos asi la line ade codigo esto nos dara error
    //var name:String = null
    // lo correcto seria colocarlo asi, en este caso nos aceptara el null
    var name:String? = null
    //opcion 1 donde se rompe la aplicacion
    //println(name!![3])
    //opcion 2 donde la aplicacion no se rompe
    //?: aca me muestra un mensaje en caso de que (name?.get(3)) sea nulo
    println(name?.get(3) ?:"Esta palabra es nula")
}
