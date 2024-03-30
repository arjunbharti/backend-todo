package com.example.todokotlinspring.service

import com.example.todokotlinspring.model.Todo
import com.example.todokotlinspring.repository.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoService(private val todoRepository: TodoRepository) {

    fun findAll(): List<Todo> = todoRepository.findAll()

    fun findById(id: String): Todo? = todoRepository.findById(id).orElse(null)

    fun save(todo: Todo): Todo = todoRepository.save(todo)

    fun deleteById(id: String) = todoRepository.deleteById(id)
}
