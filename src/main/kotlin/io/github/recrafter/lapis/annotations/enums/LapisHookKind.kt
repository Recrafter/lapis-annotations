package io.github.recrafter.lapis.annotations.enums

enum class LapisHookKind {
    Head,
    Return,
    Tail,

    Body,
    ReturnValue,

    New,
    Call,

    FieldGet,
    FieldSet,

    LocalGet,
    LocalSet,

    Literal,
}
