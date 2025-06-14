package com.example.solidprinciples.dependency_inversion_principle

/*
 *
 * High-level classes should not depend on low-level classes.
 * Both should depend on interfaces (abstractions).
 *
 * Also:
 * Details should depend on abstractions, not the other way around.
 */
// Abstraction
interface Switchable {
    fun turnOn()
    fun turnOff()
}

// Low-level module: LightBulb
class LightBulb : Switchable {
    override fun turnOn() = println("LightBulb is ON")
    override fun turnOff() = println("LightBulb is OFF")
}

// Another low-level module: Fan
class Fan : Switchable {
    override fun turnOn() = println("Fan is ON")
    override fun turnOff() = println("Fan is OFF")
}

// High-level module depends on abstraction
class ElectricSwitch(private val device: Switchable) {
    private var isOn = false

    fun press() {
        if (isOn) {
            device.turnOff()
            isOn = false
        } else {
            device.turnOn()
            isOn = true
        }
    }
}

fun main() {
    val bulb = LightBulb()
    val bulbSwitch = ElectricSwitch(bulb)
    bulbSwitch.press()  // LightBulb is ON
    bulbSwitch.press()  // LightBulb is OFF

    val fan = Fan()
    val fanSwitch = ElectricSwitch(fan)
    fanSwitch.press()   // Fan is ON
}
