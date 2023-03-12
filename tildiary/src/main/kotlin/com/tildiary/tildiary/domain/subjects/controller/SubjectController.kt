package com.tildiary.tildiary.domain.subjects.controller

import com.tildiary.tildiary.common.dto.ListResponse
import com.tildiary.tildiary.domain.subjects.dto.SubjectDto
import com.tildiary.tildiary.domain.subjects.service.SubjectService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/subjects")
class SubjectController(
    private val subjectService: SubjectService,
) {
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    fun createSubject(@RequestBody createRequest: SubjectDto.CreateSubjectRequest): SubjectDto.SubjectDetailResponse {
        return subjectService.createSubject(createRequest)
    }

    @GetMapping("/users/{user_id}/}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun listSubjects(@PathVariable("user_id") userId: Long): ListResponse<SubjectDto.SubjectDetailResponse> {
        // TODO: permission check
        return subjectService.listSubjects(userId, 1)
    }
}
