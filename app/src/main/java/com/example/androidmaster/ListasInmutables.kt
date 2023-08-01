package com.example.androidmaster

/**
 * Aca veremos las listas en kotlin estos son similares a los arrays
 * Pero los arrays tienen un problema que es saber el tamaño del array esto se debe a agregar o eliminar elementos del array
 */
fun main() {
    inmutableList()
}
fun inmutableList() {
    //-------------------------------------------------------------------------------------------------------------
    //creamos una lista de tipo String
    //notemos que esta lista es de tipo inmutable
    val readOnly:List<String> = listOf(
        "Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"
    )
    //-------------------------------------------------------------------------------------------------------------
    //Imprimimos el tamaño de la lista
    println("Tamaño de la lista: "+readOnly.size)
    //-------------------------------------------------------------------------------------------------------------
    //Imprimimos toda la lista
    println("Imprimimos los valores de la lista: \n"+readOnly)
    //-------------------------------------------------------------------------------------------------------------
    //acceder al valor de una lista mediante un indice
    println("valor de la lista 0: ${readOnly[0]}")
    //-------------------------------------------------------------------------------------------------------------
    //mostrando el ultimo valor de nuestra lista
    println("El ultimo valor de la lista es:  ${readOnly.last()}")
    //-------------------------------------------------------------------------------------------------------------
    //mostrando el primer valor de la lista
    println("El primer valor de la lista sera: ${readOnly.first()}")
    //-------------------------------------------------------------------------------------------------------------
    //las listas son estupendas para filtrar en este ejemplo veremos los valores que contienen la letra a
    //donde it es el indice de la lista
    val example = readOnly.filter { it.contains("a") }
    println("Valores de la lista que contienen la letra a: $example")
    //-------------------------------------------------------------------------------------------------------------
    //recorremos toda la lista
    //usamos el for each que es mas sencillo y dentro de los parentesis le decimos lo que queremos que haga por cada
    //posicion que tenemos en la lista en este ejemplo queremos que imprima it (it son los valores de la lista en su posicion)
    println("Imprimiendo todos los valores de la lista de 2 fomras diferentes ")
    readOnly.forEach { print("["+it+"] ") }
    println()
    //otra forma seria, si no nos gusta el it entonces podemos cambiarlo de nombre pero es mas recomendable la anterior forma
    readOnly.forEach { posicion -> print("["+posicion+"] ") }
}
