package com.example.todokotlinspring.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class Todo(
    @Id
    val id: String? = null,
    var description: String,
    var completed: Boolean = false,
    var category: String? = null,
    var deadline: LocalDateTime? = null,
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    var updatedAt: LocalDateTime? = LocalDateTime.now()
)
