package by.tms.men

import Human
import Sex

open class Man(override var name: String, override var age: Int, override var sex: Enum<Sex> = Sex.MAN) : Human {

   protected var occupation:String?=null

    override fun say() {

    }

    override fun eat() {
        println("I can eat")
    }

    override fun work() {
        println("I'd been worked for 8 hours")

    }


}