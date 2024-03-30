package com.example.todokotlinspring.controller

import com.example.todokotlinspring.model.Todo
import com.example.todokotlinspring.service.TodoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/todos")
class TodoController(private val todoService: TodoService) {

    @GetMapping
    fun getAllTodos(): ResponseEntity<List<Todo>> = ResponseEntity.ok(todoService.findAll())

    @GetMapping("/{id}")
    fun getTodoById(@PathVariable id: String): ResponseEntity<Todo> =
        todoService.findById(id)?.let {
            ResponseEntity.ok(it)
        } ?: ResponseEntity.notFound().build()

    @PostMapping
    fun createTodo(@RequestBody todo: Todo): ResponseEntity<Todo> =
        ResponseEntity.ok(todoService.save(todo))

    @DeleteMapping("/{id}")
    fun deleteTodo(@PathVariable id: String): ResponseEntity<Void> {
        todoService.deleteById(id)
        return ResponseEntity.ok().build()
    }
}
