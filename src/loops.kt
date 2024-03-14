fun main() {
    //While loop
    var number = 200
    while (number <= 205){
        println("Number is $number")
        number++
    }

    var numb = 100
    while (numb >= 95){
        println(numb)
        numb--
    }

    //Do...while loop
    var y = 20
    do {
        println(y)
        y++
    }while (y <= 25)


    //For loop
    var furniture = arrayOf("Table","Chair","Desk")
    for (z in furniture){
        println(z)
    }

    var marks = arrayOf(50,80,90)
    for (k in marks){
        println("Mark is $k")
    }

    //Range
    for (number in 30..35){
        println(number)
    }

    for (letter in 'a'..'d'){
        println(letter)
    }
}