package com.gpg.mementos.helperClasses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004J:\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0002\u0010\u00062\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00028\u00010\u00000\bH&J:\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00060\u0000\"\u0004\b\u0002\u0010\u00062\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00060\u00000\bH&J.\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0002\u0010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00060\bH&J.\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00060\u0000\"\u0004\b\u0002\u0010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H\u00060\bH&J!\u0010\f\u001a\u00028\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\bH&\u00a2\u0006\u0002\u0010\u000eJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0010\u0082\u0001\u0002\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/gpg/mementos/helperClasses/Janus;", "A", "B", "", "()V", "flatMap", "C", "mapping", "Lkotlin/Function1;", "flatMapFailure", "map", "mapFailure", "orElse", "function", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "other", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/gpg/mementos/helperClasses/Success;", "Lcom/gpg/mementos/helperClasses/Error;", "Mementos_debug"})
public abstract class Janus<A extends java.lang.Object, B extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract <C extends java.lang.Object>com.gpg.mementos.helperClasses.Janus<C, B> map(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super A, ? extends C> mapping);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <C extends java.lang.Object>com.gpg.mementos.helperClasses.Janus<C, B> flatMap(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super A, ? extends com.gpg.mementos.helperClasses.Janus<C, B>> mapping);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <C extends java.lang.Object>com.gpg.mementos.helperClasses.Janus<A, C> mapFailure(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super B, ? extends C> mapping);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <C extends java.lang.Object>com.gpg.mementos.helperClasses.Janus<A, C> flatMapFailure(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super B, ? extends com.gpg.mementos.helperClasses.Janus<A, C>> mapping);
    
    public abstract A orElse(A other);
    
    public abstract A orElse(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super B, ? extends A> function);
    
    private Janus() {
        super();
    }
}