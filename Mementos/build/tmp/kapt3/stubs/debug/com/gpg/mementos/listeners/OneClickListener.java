package com.gpg.mementos.listeners;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\nH&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/gpg/mementos/listeners/OneClickListener;", "Landroid/view/View$OnClickListener;", "delay", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(JLkotlinx/coroutines/CoroutineScope;)V", "hasClicked", "", "onClick", "", "it", "Landroid/view/View;", "onClicked", "reboundMessage", "Mementos_debug"})
public abstract class OneClickListener implements android.view.View.OnClickListener {
    private boolean hasClicked;
    private long delay;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View it) {
    }
    
    public abstract void onClicked(@org.jetbrains.annotations.NotNull()
    android.view.View it);
    
    public abstract void reboundMessage();
    
    public OneClickListener(long delay, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope) {
        super();
    }
}