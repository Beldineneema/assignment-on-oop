open class Vehicle(var make: String, var model: String, var color: String, var capacity: Int){
    fun carry(people: Int){
        var x= people-capacity
        if (capacity>=people)
            println("Carrying $people passengers")
        else
            println("Over capacity by $x people")
    }
    fun identity(){
        println("I am $color $make $model")
    }
    open fun calculateParkingFees(hours:Int): Int{
        return 20*hours
    }
}

class Car(make: String,model: String,color: String,capacity: Int): Vehicle(make, model, color, capacity) {
}
class Bus(make: String, model: String,color: String, capacity: Int): Vehicle(make, model, color, capacity){

    fun maximumTripFare(fare: Double):Double{
        return fare
    }

    override fun calculateParkingFees(hours: Int): Int {
        return hours*capacity
    }
}