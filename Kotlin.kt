/* 
----------------------------------------Introduction to Kotlin ----------------------------------------------------------------------
*/

//  Data Types & Variables
   1. mutable Variables (var)
   2. immutable vatiables (val)

   Syntax;
        val/var variableName: dataType = value

    Variable Inference

    do while Loop - exescutes atleast once
    Syntax
            fun main() {
        var index = 0
        val celsiusTemps = listOf(0.0, 87.0, 16.0, 33.0, 100.0, 65.0)
        val fahr_ratio = 1.8
        var fahr: Double

        println("-- Celsius to Fahrenheit --")
        // Write your code below
        do {
        fahr = celsiusTemps[index] * fahr_ratio + 32.0
        println("${celsiusTemps[index]}C = ${fahr}F")
        index++
        } while(fahr != 212.0)
        }