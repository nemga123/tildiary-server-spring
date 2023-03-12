package com.tildiary.tildiary.domain.tils.model

import com.tildiary.tildiary.common.model.BaseTimeEntity
import com.tildiary.tildiary.domain.subjects.model.Subject
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import jakarta.validation.constraints.NotBlank
import org.jetbrains.annotations.NotNull

@Entity
@Table
class Til(
    @field:NotBlank
    @Column(length = 100)
    val title: String,

    @field:NotBlank
    @Column(columnDefinition = "TEXT")
    val content: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    @field:NotNull
    val subject: Subject,

    @field:NotNull
    val author: Int,

    @field:NotNull
    val isOpened: Boolean,

) : BaseTimeEntity()
