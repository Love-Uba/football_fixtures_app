package com.loveuba.tryoneapplication.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/loveuba/tryoneapplication/data/repo/TryRepository;", "Lcom/loveuba/tryoneapplication/data/repo/ITryRepository;", "tryService", "Lcom/loveuba/tryoneapplication/data/TryService;", "(Lcom/loveuba/tryoneapplication/data/TryService;)V", "TAG", "", "kotlin.jvm.PlatformType", "getTry", "Lretrofit2/Response;", "Lcom/loveuba/tryoneapplication/data/models/TotalFootballData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TryRepository implements com.loveuba.tryoneapplication.data.repo.ITryRepository {
    private final com.loveuba.tryoneapplication.data.TryService tryService = null;
    private java.lang.String TAG;
    
    @javax.inject.Inject()
    public TryRepository(@org.jetbrains.annotations.NotNull()
    com.loveuba.tryoneapplication.data.TryService tryService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTry(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.loveuba.tryoneapplication.data.models.TotalFootballData>> continuation) {
        return null;
    }
}