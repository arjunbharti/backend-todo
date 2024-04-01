package com.example.todokotlinspring.config

import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.core.convert.MongoCustomConversions

@ReadingConverter
class LongToLocalDateTimeConverter : Converter<Long, LocalDateTime> {
    override fun convert(source: Long): LocalDateTime {
        return Instant.ofEpochMilli(source).atZone(ZoneId.systemDefault()).toLocalDateTime()
    }
}


@Configuration
class MongoConfig {
    @Bean
    fun mongoCustomConversions(): MongoCustomConversions {
        return MongoCustomConversions(listOf(LongToLocalDateTimeConverter()))
    }
}
