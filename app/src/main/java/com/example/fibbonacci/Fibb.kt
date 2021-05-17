package com.example.fibbonacci


fun main() {
    val n = 8
    var x = 0
    var y = 1
    var suma = 0

    for (i in 1..n) {
        suma = x + y
        x = y
        y = suma
    }
    println("n = $n")
    println("Oto wyraz ciagu: $x")

    println("Zmiana 1")
}