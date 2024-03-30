package com.example.todokotlinspring.repository

import com.example.todokotlinspring.model.Todo
import org.springframework.data.mongodb.repository.MongoRepository

interface TodoRepository : MongoRepository<Todo, String> {
}