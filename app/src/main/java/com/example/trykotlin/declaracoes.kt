package com.example.trykotlin

fun main(){
    //declaração da variável
    var frase: String = "Hello, world!"
    println(frase)

    //usando string templates
    println("$frase")
    println("${frase}")

    //acesso a funções ou propriedades
    println("Quantidade de caracteres: ${frase.count()}")
    println("Quantidade de caracteres: ${frase.length}")
}