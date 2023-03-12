package com.tildiary.tildiary.domain.subjects.repository

import com.tildiary.tildiary.domain.subjects.model.Subject
import org.springframework.data.jpa.repository.JpaRepository

interface SubjectRepository : JpaRepository<Subject, Long?> {
    fun findAllByAuthorAndOpenedIsTrue(author: Long): List<Subject>

    fun findAllByAuthor(author: Long): List<Subject>
}
