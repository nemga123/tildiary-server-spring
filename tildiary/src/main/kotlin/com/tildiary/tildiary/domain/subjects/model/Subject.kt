package com.tildiary.tildiary.domain.subjects.model

import com.tildiary.tildiary.common.model.BaseTimeEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Column
import jakarta.validation.constraints.NotNull

@Entity
@Table
class Subject(
    @field:NotNull
    @Column(length=100)
    val title: String,

    @field:NotNull
    val author: Int,

    @field:NotNull
    val is_opened: Boolean,

) : BaseTimeEntity()
