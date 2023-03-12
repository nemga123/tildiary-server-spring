package com.tildiary.tildiary.domain.subjects.repository

import com.tildiary.tildiary.domain.subjects.model.Subject
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface SubjectRepository : JpaRepository<Subject, Long?> {
    @Query(
        """
            SELECT
                subject
            FROM
                Subject AS subject
                LEFT JOIN
                    FETCH subject.tils
            WHERE
                subject.author = :author
                AND subject.opened = true
        """,
    )
    fun findAllByAuthorAndOpenedIsTrue(@Param("author") author: Long): List<Subject>

    @Query(
        """
            SELECT
                subject
            FROM
                Subject AS subject
                LEFT JOIN
                    FETCH subject.tils
            WHERE
                subject.author=:author
        """,
    )
    fun findAllByAuthor(@Param("author") author: Long): List<Subject>
}
