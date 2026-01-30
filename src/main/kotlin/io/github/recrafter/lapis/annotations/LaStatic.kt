package io.github.recrafter.lapis.annotations

import io.github.recrafter.lapis.annotations.common.La

@La
@Target(AnnotationTarget.CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class LaStatic
