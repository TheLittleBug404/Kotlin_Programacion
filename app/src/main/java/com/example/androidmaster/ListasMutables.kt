package com.example.androidmaster
//En aca veremos lo que son las listas mutables a estas podemos modificar, añadir o eliminar valores
fun mutableList() {
    //creamos una lista del tipo mutable
    var DiasSemana:MutableList<String> = mutableListOf(
        "Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"
    )
    println(DiasSemana)
    //--------------------------------------------------------------------
    //adicionamos un elemento al final de la lista
    DiasSemana.add("Ricky")
    println(DiasSemana)
    println()
    //--------------------------------------------------------------------
    //adicionamos un elemento en la posicion que nosotros queramos
    //para este ejemplo lo añadiremos en la posicion cero
    DiasSemana.add(0,"Hola")
    println("Añadiendo en la posicion cero: "+DiasSemana)
    println()
    //--------------------------------------------------------------------
    //saber si una lista esta vacia
    //Esto lo haremos con el metodo isEmpty() que nos sirve para saber si una lista esta vacia o no
    println("Imprimiendo las listas de 2 formas muy diferentes: ")
    if(DiasSemana.isEmpty())
        println("La lista esta vacia")
    else
        DiasSemana.forEach { posicion -> print("["+posicion+"] ") }
    println()
    //--------------------------------------------------------------------
    //ahora veremos cuando la lista no este vacia
    //esto se hace con el metodo isNotEmpty()
    if(DiasSemana.isNotEmpty()){
        //imprimiremos la lista con un for each de otra forma
        DiasSemana.forEach {print("["+it+"] ")}
    }
    println()
    //--------------------------------------------------------------------
    // mostramos el ultimo elemento de la lista
    println("Ultimo elemento de la lista es: ${DiasSemana.last()}")
    println()
    //--------------------------------------------------------------------
    //otra forma de imprimir los elementos de la lista
    println("Otra forma de imprimir la lista es de la siguiente manera :")
    for (indice in DiasSemana){
        print("["+indice+"] ")
    }
}
fun main() {
    mutableList()
}
