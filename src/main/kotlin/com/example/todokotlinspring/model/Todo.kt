package com.example.todokotlinspring.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Todo(
    @Id
    val id: String? = null,
    var description: String,
    var completed: Boolean = false
)
