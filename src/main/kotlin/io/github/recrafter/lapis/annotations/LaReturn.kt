package io.github.recrafter.lapis.annotations

import io.github.recrafter.lapis.annotations.common.La
import kotlin.annotation.Target

@La
@Target(AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.SOURCE)
annotation class LaReturn
