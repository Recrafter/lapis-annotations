package io.github.recrafter.lapis.annotations

import io.github.recrafter.lapis.annotations.common.La

@La
@Target(AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.SOURCE)
annotation class LaConstant(
    val int: Int = 0,
    val float: Float = 0.toFloat(),
    val long: Long = 0.toLong(),
    val double: Double = 0.toDouble(),
    val string: String = "",
)
