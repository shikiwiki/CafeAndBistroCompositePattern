package com.example.cafeandbistrocompositepattern

open class Menu(private var name: String) : MenuComponent() {
    private var menuComponents: MutableList<MenuComponent> = mutableListOf()

    override fun add(menuComponent: MenuComponent) {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        menuComponents.remove(menuComponent)
    }

    override fun getChild(i: Int): MenuComponent {
        return menuComponents[i]
    }

    override fun getName(): String {
        return name
    }

    override fun print() {
        println("\n$name")
        println("..................")

        val iterator : Iterator<MenuComponent> = menuComponents.iterator()
        while (iterator.hasNext()) {
            val menuComponent = iterator.next()
            menuComponent.print()
        }
    }
}