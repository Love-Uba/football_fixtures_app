package com.loveuba.tryoneapplication.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/loveuba/tryoneapplication/viewmodel/TryViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/loveuba/tryoneapplication/data/repo/ITryRepository;", "(Lcom/loveuba/tryoneapplication/data/repo/ITryRepository;)V", "_gamesList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/loveuba/tryoneapplication/data/models/TotalFootballData;", "gamesList", "Landroidx/lifecycle/LiveData;", "getGamesList", "()Landroidx/lifecycle/LiveData;", "getTry", "", "Companion", "app_debug"})
public final class TryViewModel extends androidx.lifecycle.ViewModel {
    private final com.loveuba.tryoneapplication.data.repo.ITryRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.loveuba.tryoneapplication.viewmodel.TryViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "TRYVIEWMODEL";
    private final androidx.lifecycle.MutableLiveData<com.loveuba.tryoneapplication.data.models.TotalFootballData> _gamesList = null;
    
    @javax.inject.Inject()
    public TryViewModel(@org.jetbrains.annotations.NotNull()
    com.loveuba.tryoneapplication.data.repo.ITryRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.loveuba.tryoneapplication.data.models.TotalFootballData> getGamesList() {
        return null;
    }
    
    public final void getTry() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/loveuba/tryoneapplication/viewmodel/TryViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}