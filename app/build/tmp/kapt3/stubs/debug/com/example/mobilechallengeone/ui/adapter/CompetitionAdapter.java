package com.example.mobilechallengeone.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/mobilechallengeone/ui/adapter/CompetitionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/mobilechallengeone/ui/adapter/CompetitionAdapter$ViewHolder;", "()V", "competitions", "Ljava/util/ArrayList;", "Lcom/loveuba/tryoneapplication/data/models/Matches;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "populateView", "result", "Lcom/loveuba/tryoneapplication/data/models/TotalFootballData;", "ViewHolder", "app_debug"})
public final class CompetitionAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.mobilechallengeone.ui.adapter.CompetitionAdapter.ViewHolder> {
    private java.util.ArrayList<com.loveuba.tryoneapplication.data.models.Matches> competitions;
    
    public CompetitionAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.mobilechallengeone.ui.adapter.CompetitionAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.mobilechallengeone.ui.adapter.CompetitionAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void populateView(@org.jetbrains.annotations.NotNull()
    com.loveuba.tryoneapplication.data.models.TotalFootballData result) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/mobilechallengeone/ui/adapter/CompetitionAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/loveuba/tryoneapplication/databinding/CompetitionItemBinding;", "(Lcom/example/mobilechallengeone/ui/adapter/CompetitionAdapter;Lcom/loveuba/tryoneapplication/databinding/CompetitionItemBinding;)V", "bind", "", "session", "Lcom/loveuba/tryoneapplication/data/models/Matches;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.loveuba.tryoneapplication.databinding.CompetitionItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.loveuba.tryoneapplication.databinding.CompetitionItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.loveuba.tryoneapplication.data.models.Matches session) {
        }
    }
}