const val ADULT_AGE = 18

fun main() {
    val person = Person("John Doe", 20)

    if (person.isAdult) {
        println("${person.name} is an adult.")
    } else {
        println("${person.name} is not an adult.")
    }
}

val Person.isAdult: Boolean
    get() = this.age >= ADULT_AGE
