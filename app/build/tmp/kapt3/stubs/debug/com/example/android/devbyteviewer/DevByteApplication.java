package com.example.android.devbyteviewer;

import java.lang.System;

/**
 * Override application to setup background work via WorkManager
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/example/android/devbyteviewer/DevByteApplication;", "Landroid/app/Application;", "()V", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "getApplicationScope", "()Lkotlinx/coroutines/CoroutineScope;", "delayedInit", "Lkotlinx/coroutines/Job;", "onCreate", "", "setupRecurringWork", "app_debug"})
public final class DevByteApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope applicationScope = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getApplicationScope() {
        return null;
    }
    
    /**
     * onCreate is called before the first screen is shown to the user.
     *
     * Use it to setup any background tasks, running expensive setup operations in a background
     * thread to avoid delaying app start.
     */
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final kotlinx.coroutines.Job delayedInit() {
        return null;
    }
    
    private final void setupRecurringWork() {
    }
    
    public DevByteApplication() {
        super();
    }
}