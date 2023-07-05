package com.example.androidmaster
//esto se recomienda al momento de anidar muchos if en java esto se conoce como switch
fun main(){
    println("introdusca un nombre: ")
    val nombre:String = readln()
    println("introdusca un mes: ")
    var mes:Int = readLine()!!.toInt()
    println("\n El  numero de mes $mes es: "+getMonth(mes))
    println("Introdusca un numero del 1 al 5 ")
    var numero:Int = readLine()!!.toInt()
    ejemploWhen(numero)
    println("Introdusca un mes para saber a que trimestre pertenece: ")
    var trimestre = readLine()!!.toInt()
    getTrimester(trimestre)
}
fun getMonth(mes:Int):String{
    when(mes){
        1 -> return "Enero"
        2 -> return "Febrero"
        3 -> return "Marzo"
        4 -> return "Abril"
        5 -> return "Mayo"
        6 -> return "Junio"
        7 -> return "Julio"
        8 -> return "Agosto"
        9 -> return "Septiembre"
        10 -> return "Octrubre"
        11 -> return "Noviembre"
        12 -> return "Diciembre"
        else -> return "no es un mes valido"
    }
}
fun ejemploWhen(n:Int){
    //si queremos colocar mas de una linea de codigo en la opcion n solamente tenemos que colocar dentro de {}
    when(n) {
        1 -> println("Introduciste 1")
        2 -> {
            //en aca podemos colocar mas de 2 lineas de codigo ya que estan en llaves
            println("Introduciste 2")
            println("Recuerda que introduciste el numero $n")
        }
        3 -> println("Introduciste 3")
        4 -> println("Introduciste 4")
        5 -> println("Introduciste 5")
        else -> println("Este no es un numero habilitado")
    }
}
//esta funcion obtiene los trimestres del años
fun getTrimester(n:Int){
    when(n){
        1,2,3 ->{
            println("El mes $n corresponde al primer trimestre: ")
            println("Enero")
            println("Febrero")
            println("Marzo")
        }
        4,5,6 ->{
            println("El mes $n corresponde al segundo trimestre: ")
            println("Abril")
            println("Mayo")
            println("Junio")
        }
        7,8,9 ->{
            println("El mes $n corresponde al tercer trimestre: ")
            println("Julio")
            println("Agosto")
            println("Septiembre")
        }
        10,11,12 ->{
            println("El mes $n corresponde al cuarto trimestre: ")
            println("Octubre")
            println("Noviembre")
            println("Diciembre")
        }
        else -> println("Este numero no corresponde a ningun mes del año")
    }
}

