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

    2. Classes
        Syntax;
            class Book {
                val pages = 320
                val title = "Harry Potter and the Sorcerer's Stone"
                val author = "J.K. Rowling"
            }

        Syntax with primary constructor, init block & member function
            class Dog(val name: String, val breed: String, val competitionsParticipated: List<String>) {
  
                // init block
                init {
                    for (comp in competitionsParticipated) {
                    println("$name participated in $comp.")
                    }
                }

                // Member function below 
                fun speak() {
                println("$name says: Woof!")
                }

            }

            fun main() {
                // Write your instance below 🐩
                val maxie = Dog("Maxie", "Poodle", listOf("Westminster Kennel Club Dog Show", "AKC National Championship"))
                maxie.speak()
            }