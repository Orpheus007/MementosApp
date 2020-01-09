package com.gpg.mementos.base;

import java.lang.System;

/**
 * From Darel Bitsy's clean-arch repo here:
 *
 * https://github.com/bitsydarel/clean-arch/blob/master/core/src/commonMain/kotlin/com/bitsydarel/cleanarch/core/usecases/UseCase.kt
 * @param <out>
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00028\u0000H\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\u0006\u001a\u00028\u0000H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/gpg/mementos/base/Izanagi;", "R", "", "()V", "buildUseCase", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "Mementos_debug"})
public abstract class Izanagi<R extends java.lang.Object> {
    
    /**
     * Build the use case to be executed.
     *
     * @return result [R] of the use case.
     */
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object buildUseCase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super R> p0);
    
    /**
     * Execute the use case.
     *
     * Called by client of the use case.
     *
     * @return [R] result of executing this use case
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super R> p0) {
        return null;
    }
    
    public Izanagi() {
        super();
    }
}