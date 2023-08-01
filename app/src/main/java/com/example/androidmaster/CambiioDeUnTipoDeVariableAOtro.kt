package com.example.androidmaster.CambiioDeUnTipoDeVariableAOtroKt

//en aca veremos como podemos cambiar de uns tipo de variable a otro tipo de variable
//para convertir de una variable a otra simplemente usamos el toInt,toFloat,toString etc
//tambien veremos la concatenacion de cadenas
fun IntAFloat(a:Int, b:Float){
   println("Cambiamos de un tipo Int a un Float")
   var suma:Int = a + b.toInt()
   println(suma)
}
fun concatenarString(a:String, b:String){
    println(a+b)
    //recoredemos que en kotlin la concatenacion es con el simbolo de $ (dolar)
    var nuevoString:String = "Esta es la nueva palabra de tip String $a y $b"
    println(nuevoString)
}
fun main(){
    IntAFloat(5,6.5f)
    concatenarString("Ricardo","fernando")
}
