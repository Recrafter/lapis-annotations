package io.github.recrafter.lapis.annotations

import io.github.recrafter.lapis.annotations.common.La
import io.github.recrafter.lapis.annotations.enums.LapisHookKind
import kotlin.annotation.Target

@La
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class LaHook(val kind: LapisHookKind)
