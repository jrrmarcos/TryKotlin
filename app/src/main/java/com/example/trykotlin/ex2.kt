package com.example.trykotlin

fun main(){
    val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Pai","Pedro"),
    Pair("Mãe","Marcela"),
    Pair("Filho","João"),
    Pair("Filho","Cadu"),
    Pair("Pet","Paçoca"))

    familiaMap.keys.forEach { println("$it : ${familiaMap[it]}")}
}