package com.rsk

fun main(args: Array<String>) {
//    our list can hold null value or assign null
    var people: MutableList<Person?>? = null


    people = mutableListOf(Person(90), Person(12), Person(34))

    people.add(null)

    for (person in people.filterNotNull()){
        println(person.age)
    }
}

class Person(val age: Int): Orginizer{
    override fun processMeetings(meetings: List<Meeting>) {
        TODO("Not yet implemented")
    }

}