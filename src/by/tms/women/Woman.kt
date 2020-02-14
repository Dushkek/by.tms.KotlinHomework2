package by.tms.women

import Human
import Sex

open class Woman(override var name: String, override var age: Int, override var sex: Enum<Sex> = Sex.WOMEN) : Human {

   protected var placeOfWork:String?=null

    override fun eat() {
        println("I can eat")
    }

    override fun work() {
        println("I'd been worked for 8 hours")
    }

    override fun say() {


    }

}