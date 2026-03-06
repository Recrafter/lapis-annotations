package io.github.recrafter.lapis.annotations

import io.github.recrafter.lapis.annotations.common.La

@La
@Target(AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.SOURCE)
annotation class LaOrdinal(vararg val indices: Int) {

    companion object {
        const val FIRST: Int = 0
        const val LAST: Int = Int.MIN_VALUE
    }
}
