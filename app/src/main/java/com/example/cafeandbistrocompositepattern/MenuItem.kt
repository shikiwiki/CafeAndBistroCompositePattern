package com.example.cafeandbistrocompositepattern

class MenuItem(private val name: String, private val price: Double) : MenuComponent() {
    override fun getName(): String {
        return name
    }

    override fun getPrice(): Double {
        return price
    }

    override fun print() {
        println(" $name")
        println(", $price")
    }

}
