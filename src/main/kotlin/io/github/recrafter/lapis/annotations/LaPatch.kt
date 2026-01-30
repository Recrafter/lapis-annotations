package io.github.recrafter.lapis.annotations

import io.github.recrafter.lapis.annotations.common.La
import io.github.recrafter.lapis.annotations.enums.LapisPatchSide
import kotlin.reflect.KClass

@La
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class LaPatch(
    val target: KClass<*>,
    val side: LapisPatchSide = LapisPatchSide.Common,
    val widener: String = "",
)
