package io.github.recrafter.lapis.annotations

import io.github.recrafter.lapis.annotations.common.La
import io.github.recrafter.lapis.annotations.enums.LapisHookKind
import io.github.recrafter.lapis.api.LapisDescriptor
import kotlin.reflect.KClass

@La
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class LaHook(
    val method: KClass<out LapisDescriptor<*>>,
    val kind: LapisHookKind,
)
