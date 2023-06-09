package com.loveuba.tryoneapplication.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/loveuba/tryoneapplication/di/TryOneModule;", "", "()V", "provideApiService", "Lcom/loveuba/tryoneapplication/data/TryService;", "retrofit", "Lretrofit2/Retrofit;", "provideClient", "Lokhttp3/OkHttpClient;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideLogger", "provideRetrofitClient", "okHttpClient", "provideTryRepository", "Lcom/loveuba/tryoneapplication/data/repo/ITryRepository;", "tryService", "app_debug"})
@dagger.Module()
public final class TryOneModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.loveuba.tryoneapplication.di.TryOneModule INSTANCE = null;
    
    private TryOneModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor provideLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideClient(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor logger) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofitClient(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.loveuba.tryoneapplication.data.TryService provideApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.loveuba.tryoneapplication.data.repo.ITryRepository provideTryRepository(@org.jetbrains.annotations.NotNull()
    com.loveuba.tryoneapplication.data.TryService tryService) {
        return null;
    }
}