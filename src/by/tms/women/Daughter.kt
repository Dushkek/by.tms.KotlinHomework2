package by.tms.women

import Sex

class Daughter(name: String, age: Int, sex: Enum<Sex>, placeOfWork: String, pairsOfShoes: Int) :
    Mother(name, age, sex, placeOfWork, pairsOfShoes) {

    override fun say() {
        println("My name is $name. I'm $age years old. I've been studding in $placeOfWork. In my wardrobe $pairsOfShoes pairs of shoes")

    }
}