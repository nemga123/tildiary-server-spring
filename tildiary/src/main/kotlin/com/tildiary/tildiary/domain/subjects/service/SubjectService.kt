package com.tildiary.tildiary.domain.subjects.service

import com.tildiary.tildiary.common.dto.ListResponse
import com.tildiary.tildiary.domain.subjects.dto.SubjectDto
import com.tildiary.tildiary.domain.subjects.model.Subject
import com.tildiary.tildiary.domain.subjects.repository.SubjectRepository
import org.springframework.stereotype.Service

@Service
class SubjectService(
    private val subjectRepository: SubjectRepository,
) {
    fun createSubject(createSubjectRequest: SubjectDto.CreateSubjectRequest): SubjectDto.SubjectDetailResponse {
        val subject = Subject(
            title = createSubjectRequest.title,
            author = 1,
            opened = createSubjectRequest.isOpened,
        )
        val obj = subjectRepository.save(subject)
        return SubjectDto.SubjectDetailResponse(obj)
    }

    fun listSubjects(userId: Long, currentUserId: Long): ListResponse<SubjectDto.SubjectDetailResponse> {
        return if (userId == currentUserId) {
            val subjects = subjectRepository.findAllByAuthor(userId)
            ListResponse(subjects.map { SubjectDto.SubjectDetailResponse(it) })
        } else {
            val subjects = subjectRepository.findAllByAuthorAndOpenedIsTrue(userId)
            ListResponse(subjects.map { SubjectDto.SubjectDetailResponse(it) })
        }
    }
}
