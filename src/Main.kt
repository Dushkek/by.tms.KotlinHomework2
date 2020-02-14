import by.tms.men.Father
import by.tms.men.Son
import by.tms.women.Daughter
import by.tms.women.Mother
import kotlin.collections.ArrayList

fun main() {
    val father = Father("Valery", 40, Sex.MAN, "Programmer", "Audi")
    val son = Son("Nicholas", 20, Sex.MAN, "Student", "Kia")
    val mother = Mother("Elizabeth", 39, Sex.WOMEN, "TMS", 15)
    val daughter = Daughter("Jessika", 18, Sex.WOMEN, "BSU", 20)

    father.say()
    mother.say()
    son.say()
    daughter.say()

    val humans = ArrayList<Human>()
    humans.add(father)
    humans.add(mother)
    humans.add(son)
    humans.add(daughter)

    humans.sortByDescending {
        it.age
    }

    println(humans.map { "${it.name} ${it.age}" })
}