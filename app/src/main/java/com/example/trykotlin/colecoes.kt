package com.example.trykotlin

fun main(){
    var familia: List<String> = listOf("Pedro","Marcela","JP","Cadu")

    //for
    for (integrante in familia) {
        println(integrante)
    }

    /*familia.add("Paçoca")
    familia = listOf("Pedro","Marcela","JP","Cadu","Paçoca")
    for (integrante in familia) {
        println(integrante)
    }*/

    val listaInteiros: List<Int> = listOf(1,2,3,4,5,6,7,8,9,10)
    /*List<Int> = (1..10 step 2).toList()
    for (i in 0..9){
        println(listaInteiros[i])
    }*/

    listaInteiros.forEach{ println(it) }

    val listaCursos : MutableList<String> = mutableListOf(
            "Análise e desenvolvimento de sistemas",
            "Sistemas para dispositivos móveis"
    )
    listaCursos.add("Técnico em informática para Internet")
    listaCursos.forEach{ cadaCurso: String ->
        println(cadaCurso)
    }

    val setCursos: MutableSet<String> = mutableSetOf("ADS","SDM","TII")
    setCursos.add("ADS")
    setCursos.add("SDM")
    setCursos.forEach{println(it)}
}