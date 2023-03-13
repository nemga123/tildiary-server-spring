package com.tildiary.tildiary.domain.subjects.dto

import com.tildiary.tildiary.domain.subjects.model.Subject
import java.time.LocalDateTime

class SubjectDto {
    data class CreateSubjectRequest(
        val title: String,
        val isOpened: Boolean = true,
    )

    data class UpdateSubjectRequest(
        val title: String?,
        val isOpened: Boolean?,
    )

    data class SubjectDetailResponse(
        val id: Long,
        val title: String,
        val author: Long,
        val isOpened: Boolean,
        val tilCounts: Int,
        val createdAt: LocalDateTime?,
        val updatedAt: LocalDateTime?,
    ) {
        constructor(subject: Subject) : this(
            id = subject.id,
            title = subject.title,
            author = subject.author,
            isOpened = subject.opened,
            tilCounts = subject.tils.size,
            createdAt = subject.createdAt,
            updatedAt = subject.updatedAt,
        )
    }
}
