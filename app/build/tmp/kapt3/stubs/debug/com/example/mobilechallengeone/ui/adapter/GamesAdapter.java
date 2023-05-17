package com.example.mobilechallengeone.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001$B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\u001c\u0010\u0019\u001a\u00020\u00142\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0010H\u0016J)\u0010\u001f\u001a\u00020\u00142!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000fJ\u0018\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/mobilechallengeone/ui/adapter/GamesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/mobilechallengeone/ui/adapter/GamesAdapter$GamesViewHolder;", "gameList", "Ljava/util/ArrayList;", "Lcom/loveuba/tryoneapplication/data/models/Matches;", "Lkotlin/collections/ArrayList;", "avg", "", "(Ljava/util/ArrayList;Ljava/lang/String;)V", "getAvg", "()Ljava/lang/String;", "setAvg", "(Ljava/lang/String;)V", "onItemClickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "", "filterGames", "", "games", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "showToast", "adapterPosition", "context", "Landroid/content/Context;", "GamesViewHolder", "app_debug"})
public final class GamesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.mobilechallengeone.ui.adapter.GamesAdapter.GamesViewHolder> {
    private final java.util.ArrayList<com.loveuba.tryoneapplication.data.models.Matches> gameList = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String avg;
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClickListener;
    
    public GamesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.loveuba.tryoneapplication.data.models.Matches> gameList, @org.jetbrains.annotations.NotNull()
    java.lang.String avg) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAvg() {
        return null;
    }
    
    public final void setAvg(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.loveuba.tryoneapplication.data.models.Matches> filterGames(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.loveuba.tryoneapplication.data.models.Matches> games) {
        return null;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClickListener) {
    }
    
    private final void showToast(int adapterPosition, android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.mobilechallengeone.ui.adapter.GamesAdapter.GamesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.mobilechallengeone.ui.adapter.GamesAdapter.GamesViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012#\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/mobilechallengeone/ui/adapter/GamesAdapter$GamesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/loveuba/tryoneapplication/databinding/GameItemBinding;", "onItemClickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "", "(Lcom/example/mobilechallengeone/ui/adapter/GamesAdapter;Lcom/loveuba/tryoneapplication/databinding/GameItemBinding;Lkotlin/jvm/functions/Function1;)V", "bind", "games", "Lcom/loveuba/tryoneapplication/data/models/Matches;", "app_debug"})
    public final class GamesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.loveuba.tryoneapplication.databinding.GameItemBinding binding = null;
        
        public GamesViewHolder(@org.jetbrains.annotations.NotNull()
        com.loveuba.tryoneapplication.databinding.GameItemBinding binding, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClickListener) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.loveuba.tryoneapplication.data.models.Matches games) {
        }
    }
}