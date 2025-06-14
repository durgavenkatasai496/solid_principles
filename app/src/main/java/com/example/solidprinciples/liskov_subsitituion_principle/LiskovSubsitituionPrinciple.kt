package com.example.solidprinciples.liskov_subsitituion_principle

/*
 * Liskov Substitution Principle :
 * Objects of Superclass Should be replaceable with objects of a subclass without affecting correctness.
 */


interface Bird {
    fun move(): String
}

// Special behavior for birds that can fly
interface Flyable {
    fun fly(): String
}

// Special behavior for birds that can swim
interface Swimmable {
    fun swim(): String
}

// Sparrow can fly
class Sparrow : Bird, Flyable {
    override fun move(): String = "Flying"
    override fun fly(): String = "Soaring through the sky"
}

// Penguin can swim
class Penguin : Bird, Swimmable {
    override fun move(): String = "Swimming"
    override fun swim(): String = "Gliding through water"
}

// Common function using only Bird behavior
fun makeBirdMove(bird: Bird) {
    println(bird.move())
}

// Safe optional functions using abilities
fun makeBirdFly(bird: Bird) {
    if (bird is Flyable) {
        println(bird.fly())
    }
}

fun makeBirdSwim(bird: Bird) {
    if (bird is Swimmable) {
        println(bird.swim())
    }
}

// Usage
fun main() {
    val sparrow = Sparrow()
    val penguin = Penguin()

    makeBirdMove(sparrow)
    makeBirdFly(sparrow)

    makeBirdMove(penguin)
    makeBirdSwim(penguin)
}
