package by.tms.men

import Sex

class Son(name: String, age: Int, sex: Enum<Sex>, occupation: String, car: String) :
    Father(name, age, sex, occupation, car) {

    override fun say() {
        println("My name is $name. I'm $age years old. My occupation is a $occupation. As a result of Dad's work I have $car")
    }
}