package com.example.batchprocessing

class Person {
    lateinit var lastName: String
    lateinit var firstName: String

    constructor() {}

    constructor(firstName: String, lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
    }

    override fun toString(): String {
        return "firstName: $firstName, lastName: $lastName"
    }
}