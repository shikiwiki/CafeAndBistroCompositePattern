package com.example.cafeandbistrocompositepattern

fun main() {
    val dinerMenu = Menu("Bistro Menu")
    val cafeMenu = Menu("Cafe Menu")
    val dessertMenu = Menu("Desert Menu")

    val allMenus : MenuComponent = Menu("All Menus")

    allMenus.add(dinerMenu)
    allMenus.add(cafeMenu)

    dinerMenu.add(MenuItem("Pasta Bolognese", 12.00))

    dinerMenu.add(dessertMenu)
    dessertMenu.add(MenuItem("Tiramisu", 10.00))

    val waitress = Waitress(allMenus)
    waitress.printMenu()
}