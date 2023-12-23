package com.example.cafeandbistrocompositepattern

class CafeMenu(name: String) : Menu(name) {

    private var items: MutableMap<String, MenuItem> = mutableMapOf(
        "Cap" to MenuItem("Cappuccino", 2.50),
        "Lat" to MenuItem("Latte", 2.50)
    )

    fun addItem(name: String, menuItem: MenuItem) {
        items[name] = menuItem
    }

}