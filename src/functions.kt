fun main() {
    //Predefined Functions
    println("Hello Kotlin")

    var x = Math.min(45,89)
    println(x)

    var y = Math.max(90,124)
    println("The maximum value is $y")

    var z = Math.round(45.98)
    println(z)

    name()

    product(12,30)//calling a function

    details("Joe",56)
    details("Mary",21)

}

//User defined functions
fun name() {
    println("Melisa")
}

fun product(num1:Int,num2:Int){
    println(num1*num2)

}

fun details(name:String,age:Int){
    println("$name is $age years old")

}

