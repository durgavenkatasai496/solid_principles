package com.example.solidprinciples.interface_segeration_principle

/*
 * Interface Segregation Principle :
 * Do not force a class to implement methods it does not use.
 */


// Segregated interfaces
interface Workable {
    fun work()
}

interface Eatable {
    fun eat()
}

// Human does both
class Human : Workable, Eatable {
    override fun work() {
        println("Human is working.")
    }

    override fun eat() {
        println("Human is eating.")
    }
}

// Robot only works
class Robot : Workable {
    override fun work() {
        println("Robot is working.")
    }
}


fun main() {
    val human = Human()
    val robot = Robot()

    human.work()   // Output: Human is working.
    human.eat()    // Output: Human is eating.

    robot.work()   // Output: Robot is working.
    // robot.eat() ❌ Not available — and that’s the point!
}
