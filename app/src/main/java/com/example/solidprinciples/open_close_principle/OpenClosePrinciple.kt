package com.example.solidprinciples.open_close_principle

/*
 * Class Should be open for extension but closed for modification.
 * Use inheritance and interfaces to extend behaviour.
 */

fun main() {
    val regularCustomer = RegularCustomer()
    val premiumCustomer = PremiumCustomer()
    val vipCustomer = VipCustomer()

    val discountCalculator = DiscountCalculator()

    val amount = 1000.0

    println("Regular Customer Final Amount: ₹${discountCalculator.calculator(regularCustomer, amount)}")
    println("Premium Customer Final Amount: ₹${discountCalculator.calculator(premiumCustomer, amount)}")
    println("VIP Customer Final Amount: ₹${discountCalculator.calculator(vipCustomer, amount)}")
}


abstract class Customer {
    abstract fun getDiscount() : Double
}

class RegularCustomer : Customer(){
    override fun getDiscount(): Double = 1.0
}

class PremiumCustomer : Customer(){
    override fun getDiscount(): Double = 0.9
}

class VipCustomer : Customer(){
    override fun getDiscount(): Double = 0.8
}

class DiscountCalculator{
    fun calculator(customer: Customer,amount : Double) : Double {
        return amount * customer.getDiscount()
    }
}