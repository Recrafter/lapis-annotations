package io.github.recrafter.lapis.annotations

import io.github.recrafter.lapis.annotations.common.La
import kotlin.reflect.KClass

@La
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class LaDescriptors(val target: KClass<*>)
