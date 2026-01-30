package io.github.recrafter.lapis.annotations

import io.github.recrafter.lapis.annotations.common.La

@La
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class LaAccess(val vanillaName: String = "")
