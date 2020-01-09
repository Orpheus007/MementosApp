package com.gpg.mementos.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/gpg/mementos/base/Orpheus;", "EventType", "Lkotlinx/coroutines/CoroutineScope;", "main", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "jobTracker", "Lkotlinx/coroutines/Job;", "getJobTracker", "()Lkotlinx/coroutines/Job;", "getMain", "()Lkotlinx/coroutines/CoroutineDispatcher;", "dispatch", "", "eventType", "(Ljava/lang/Object;)V", "Mementos_debug"})
public abstract class Orpheus<EventType extends java.lang.Object> implements kotlinx.coroutines.CoroutineScope {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.Job jobTracker = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineDispatcher main = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.Job getJobTracker() {
        return null;
    }
    
    public abstract void dispatch(EventType eventType);
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.CoroutineDispatcher getMain() {
        return null;
    }
    
    public Orpheus(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher main) {
        super();
    }
}