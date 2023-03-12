package com.tildiary.tildiary.common.dto

data class ListResponse<T>(
    val elements: List<T>,
    val count: Int,
) {
    constructor(list: List<T>) : this(
        elements = list,
        count = list.size,
    )
}
