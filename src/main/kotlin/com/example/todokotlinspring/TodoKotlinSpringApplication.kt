package com.example.todokotlinspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication

class TodoKotlinSpringApplication

fun main(args: Array<String>) {
	runApplication<TodoKotlinSpringApplication>(*args)
}
