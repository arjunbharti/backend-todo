package com.example.todokotlinspring.service

import com.example.todokotlinspring.model.Todo
import com.example.todokotlinspring.repository.TodoRepository
import org.springframework.cglib.core.Local
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.time.ZonedDateTime

@Service
class TodoService(private val todoRepository: TodoRepository) {

    fun findAll(): List<Todo> = todoRepository.findAll()

    fun findById(id: String): Todo? = todoRepository.findById(id).orElse(null)

    fun save(todo: Todo): Todo {
        todo.updatedAt = LocalDateTime.now()
        return todoRepository.save(todo)
    }

    fun deleteById(id: String) = todoRepository.deleteById(id)
}
