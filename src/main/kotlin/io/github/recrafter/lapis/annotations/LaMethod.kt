package io.github.recrafter.lapis.annotations

import io.github.recrafter.lapis.annotations.common.La
import kotlin.annotation.Target

@La
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class LaMethod
