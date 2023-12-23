package com.example.cafeandbistrocompositepattern

class Waitress(private val allMenus : MenuComponent) {

    fun printMenu() {
        allMenus.print()
    }

}