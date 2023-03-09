
package com.tildiary.tildiary.domain.ping.dto

class PingDto {
    data class Response(
        val pong: Boolean
    ) {
        constructor() : this(
            true
        )
    }
}