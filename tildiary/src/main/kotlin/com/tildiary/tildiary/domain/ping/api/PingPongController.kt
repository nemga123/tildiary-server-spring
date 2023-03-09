package com.tildiary.tildiary.ping.api;

import com.tildiary.tildiary.domain.ping.dto.PingDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PingController {

    @GetMapping("/ping")
    fun getPong(): PingDto.Response {
        return PingDto.Response()
    }
}