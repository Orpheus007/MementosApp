package com.gpg.mementos.helperClasses

sealed class Janus<A, B> {
    abstract fun <C> map(mapping: (A) -> C): Janus<C, B>
    abstract fun <C> flatMap(mapping: (A) -> Janus<C, B>): Janus<C, B>
    abstract fun <C> mapFailure(mapping: (B) -> C): Janus<A, C>
    abstract fun <C> flatMapFailure(mapping: (B) -> Janus<A, C>): Janus<A, C>
    abstract fun orElse(other: A): A
    abstract fun orElse(function: (B) -> A): A
}

data class Success<A, B>(val value: A) : Janus<A, B>() {
    override fun <C> map(mapping: (A) -> C): Janus<C, B> = Success(mapping(value))
    override fun <C> flatMap(mapping: (A) -> Janus<C, B>): Janus<C, B> = mapping(value)
    override fun <C> mapFailure(mapping: (B) -> C): Janus<A, C> = Success(value)
    override fun <C> flatMapFailure(mapping: (B) -> Janus<A, C>): Janus<A, C> = Success(value)
    override fun orElse(other: A): A = value
    override fun orElse(function: (B) -> A): A = value
}

data class Error<A, B>(val value: B) : Janus<A, B>() {
    override fun <C> map(mapping: (A) -> C): Janus<C, B> = Error(value)
    override fun <C> flatMap(mapping: (A) -> Janus<C, B>): Janus<C, B> = Error(value)
    override fun <C> mapFailure(mapping: (B) -> C): Janus<A, C> = Error(mapping(value))
    override fun <C> flatMapFailure(mapping: (B) -> Janus<A, C>): Janus<A, C> = mapping(value)
    override fun orElse(other: A): A = other
    override fun orElse(function: (B) -> A): A = function(value)
}