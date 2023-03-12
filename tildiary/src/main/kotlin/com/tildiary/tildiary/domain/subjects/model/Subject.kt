package com.tildiary.tildiary.domain.subjects.model

import com.tildiary.tildiary.common.model.BaseTimeEntity
import com.tildiary.tildiary.domain.tils.model.Til
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.OneToMany
import jakarta.persistence.Table
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

@Entity
@Table
class Subject(
    @field:NotBlank
    @Column(length = 100)
    val title: String,

    @field:NotNull
    val author: Long,

    @field:NotNull
    @Column(name = "is_opened")
    val opened: Boolean,

    @OneToMany(mappedBy = "subject")
    var tils: MutableList<Til> = mutableListOf(),
) : BaseTimeEntity()
