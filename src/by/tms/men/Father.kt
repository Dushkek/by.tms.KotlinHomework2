package by.tms.men

import Sex

open class Father(name: String,age: Int,sex: Enum<Sex>) : Man(name, age, sex) {
    constructor(name: String, age: Int, sex: Enum<Sex>,occupation: String) : this(name, age, sex){
        this.occupation=occupation
    }

    protected var car: String? = null

    constructor(name: String, age: Int, sex: Enum<Sex>, occupation: String, car:String ):this(name, age, sex,occupation){
        this.car=car
    }

    override fun say() {
        println("My name is $name. I'm $age years old. My occupation is a $occupation. As a result of my work I have $car")
    }



}