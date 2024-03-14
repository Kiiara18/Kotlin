fun main() {

    var greeting = "Hello world"
    var firstname = "Melisa"
    var lastname = "eMobilis"

    //String concatenation
    println(firstname+ " "+lastname)
    println(firstname.plus(lastname))

    //Accessing an element( index position) in a string
    println(greeting[6])

    //Determine an index position of an element
    println(greeting.indexOf("world"))//for a word inside the double quotes
    println(greeting.indexOf('H'))//for a letter inside the single quote

    //Modifying a string
    println(greeting.uppercase())

    //String interpolation
    println("Hello there, my name is $firstname $lastname")

    //Size of a string
    println(greeting.length)

}