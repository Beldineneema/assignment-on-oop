fun main(){
    var person=Human("Neema",21,56.31)
    person.eat(3)
    person.speak("I like chapatti")
    person.birthday()

    var details=Human.User("Neema","Beldine","beldineneema@gmail.com","0704192933",9900)
    println(details.email)
    println(details.firstName)
}

class Human(var name:String,var age:Int,var weight:Double){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food.")

    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday():Int{
        age+=1
        println(age)
        return(age)

    }

    data class User(val firstName:String,val lastName:String,val email:String,val phoneNumber:String,val password:Int){

    }
}