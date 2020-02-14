package by.tms.women

import Sex

open class Mother(name: String, age: Int, sex: Enum<Sex>) : Woman(name, age, sex) {
    constructor(name: String, age: Int, sex: Enum<Sex>, placeOfWork: String) : this(name, age, sex){
        this.placeOfWork=placeOfWork
    }

   protected var pairsOfShoes: Int? = null

    constructor(name: String,age: Int,sex: Enum<Sex>,placeOfWork: String,pairsOfShoes:Int):this(name, age, sex, placeOfWork){
        this.pairsOfShoes=pairsOfShoes
    }

    override fun say() {
        println("My name is $name. I'm $age years old. I've been studding in $placeOfWork. In my wardrobe $pairsOfShoes pairs of shoes")

    }
}