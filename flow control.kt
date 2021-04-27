fun main(){
    odd()

    println(name(arrayOf("Jeff","Dom","Kevoh","Robert")))
    robot(4)
    robot(11)
    robot(27)
    numbers()
}

fun odd(){
    for (i in 1..100)
        if(i % 2 == 1){
            println(1)
        }
}
fun name(names: Array<String>): Int{
    var total =0
    for (character in names){
        if (character.length > 5){
            total++
        }
    }
    return total
}

fun robot(age:Int){
    if(age <6){
        println("Here have a glass of milk!")
        }else if (age>6 && age <15){
            println("Here is a bottle of fanta for you")
        }else{
            println("Here is a bottle of cocacola for you")
        }
    }

fun numbers(){
    for(num in 1..100)
        if(num% 3==0 && num %3==0){
            println("fizzBuss")
        }else if (num%5==0){
            println("Buzz")
        }else if (num%3==0){
            println("Fiz")
        }else if (num%3!= 0&& num%5!=0){
            println(num)
        }
}
