package com.loveuba.tryoneapplication.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u001cJ\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u00c6\u0003J\t\u00109\u001a\u00020\u0016H\u00c6\u0003J\t\u0010:\u001a\u00020\u0018H\u00c6\u0003J\t\u0010;\u001a\u00020\u000eH\u00c6\u0003J\t\u0010<\u001a\u00020\u000eH\u00c6\u0003J\t\u0010=\u001a\u00020\u000eH\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\u0007H\u00c6\u0003J\t\u0010@\u001a\u00020\u0001H\u00c6\u0003J\t\u0010A\u001a\u00020\nH\u00c6\u0003J\t\u0010B\u001a\u00020\fH\u00c6\u0003J\t\u0010C\u001a\u00020\u000eH\u00c6\u0003J\t\u0010D\u001a\u00020\fH\u00c6\u0003J\t\u0010E\u001a\u00020\u0011H\u00c6\u0003J\u00a5\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010J\u001a\u00020\fH\u00d6\u0001J\t\u0010K\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000f\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0019\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0011\u0010\u001a\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010*R\u0011\u0010\u001b\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010*\u00a8\u0006L"}, d2 = {"Lcom/loveuba/tryoneapplication/data/models/Matches;", "", "area", "Lcom/loveuba/tryoneapplication/data/models/Area;", "awayTeam", "Lcom/loveuba/tryoneapplication/data/models/AwayTeam;", "competition", "Lcom/loveuba/tryoneapplication/data/models/Competition;", "group", "homeTeam", "Lcom/loveuba/tryoneapplication/data/models/HomeTeam;", "id", "", "lastUpdated", "", "matchday", "odds", "Lcom/loveuba/tryoneapplication/data/models/Odds;", "referees", "", "Lcom/loveuba/tryoneapplication/data/models/Referee;", "score", "Lcom/loveuba/tryoneapplication/data/models/Score;", "season", "Lcom/loveuba/tryoneapplication/data/models/Season;", "stage", "status", "utcDate", "(Lcom/loveuba/tryoneapplication/data/models/Area;Lcom/loveuba/tryoneapplication/data/models/AwayTeam;Lcom/loveuba/tryoneapplication/data/models/Competition;Ljava/lang/Object;Lcom/loveuba/tryoneapplication/data/models/HomeTeam;ILjava/lang/String;ILcom/loveuba/tryoneapplication/data/models/Odds;Ljava/util/List;Lcom/loveuba/tryoneapplication/data/models/Score;Lcom/loveuba/tryoneapplication/data/models/Season;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArea", "()Lcom/loveuba/tryoneapplication/data/models/Area;", "getAwayTeam", "()Lcom/loveuba/tryoneapplication/data/models/AwayTeam;", "getCompetition", "()Lcom/loveuba/tryoneapplication/data/models/Competition;", "getGroup", "()Ljava/lang/Object;", "getHomeTeam", "()Lcom/loveuba/tryoneapplication/data/models/HomeTeam;", "getId", "()I", "getLastUpdated", "()Ljava/lang/String;", "getMatchday", "getOdds", "()Lcom/loveuba/tryoneapplication/data/models/Odds;", "getReferees", "()Ljava/util/List;", "getScore", "()Lcom/loveuba/tryoneapplication/data/models/Score;", "getSeason", "()Lcom/loveuba/tryoneapplication/data/models/Season;", "getStage", "getStatus", "getUtcDate", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Matches {
    @org.jetbrains.annotations.NotNull()
    private final com.loveuba.tryoneapplication.data.models.Area area = null;
    @org.jetbrains.annotations.NotNull()
    private final com.loveuba.tryoneapplication.data.models.AwayTeam awayTeam = null;
    @org.jetbrains.annotations.NotNull()
    private final com.loveuba.tryoneapplication.data.models.Competition competition = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object group = null;
    @org.jetbrains.annotations.NotNull()
    private final com.loveuba.tryoneapplication.data.models.HomeTeam homeTeam = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lastUpdated = null;
    private final int matchday = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.loveuba.tryoneapplication.data.models.Odds odds = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.loveuba.tryoneapplication.data.models.Referee> referees = null;
    @org.jetbrains.annotations.NotNull()
    private final com.loveuba.tryoneapplication.data.models.Score score = null;
    @org.jetbrains.annotations.NotNull()
    private final com.loveuba.tryoneapplication.data.models.Season season = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String stage = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String utcDate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.loveuba.tryoneapplication.data.models.Matches copy(@org.jetbrains.annotations.NotNull()
    com.loveuba.tryoneapplication.data.models.Area area, @org.jetbrains.annotations.NotNull()
    com.loveuba.tryoneapplication.data.models.AwayTeam awayTeam, @org.jetbrains.annotations.NotNull()
    com.loveuba.tryoneapplication.data.models.Competition competition, @org.jetbrains.annotations.NotNull()
    java.lang.Object group, @org.jetbrains.annotations.NotNull()
    com.loveuba.tryoneapplication.data.models.HomeTeam homeTeam, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String lastUpdated, int matchday, @org.jetbrains.annotations.NotNull()
    com.loveuba.tryoneapplication.data.models.Odds odds, @org.jetbrains.annotations.NotNull()
    java.util.List<com.loveuba.tryoneapplication.data.models.Referee> referees, @org.jetbrains.annotations.NotNull()
    com.loveuba.tryoneapplication.data.models.Score score, @org.jetbrains.annotations.NotNull()
    com.loveuba.tryoneapplication.data.models.Season season, @org.jetbrains.annotations.NotNull()
    java.lang.String stage, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String utcDate) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Matches(@org.jetbrains.annotations.NotNull()
    com.loveuba.tryoneapplication.data.models.Area area, @org.jetbrains.annotations.NotNull()
    com.loveuba.tryoneapplication.data.models.AwayTeam awayTeam, @org.jetbrains.annotations.NotNull()
    com.loveuba.tryoneapplication.data.models.Competition competition, @org.jetbrains.annotations.NotNull()
    java.lang.Object group, @org.jetbrains.annotations.NotNull()
    com.loveuba.tryoneapplication.data.models.HomeTeam homeTeam, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String lastUpdated, int matchday, @org.jetbrains.annotations.NotNull()
    com.loveuba.tryoneapplication.data.models.Odds odds, @org.jetbrains.annotations.NotNull()
    java.util.List<com.loveuba.tryoneapplication.data.models.Referee> referees, @org.jetbrains.annotations.NotNull()
    com.loveuba.tryoneapplication.data.models.Score score, @org.jetbrains.annotations.NotNull()
    com.loveuba.tryoneapplication.data.models.Season season, @org.jetbrains.annotations.NotNull()
    java.lang.String stage, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String utcDate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.loveuba.tryoneapplication.data.models.Area component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.loveuba.tryoneapplication.data.models.Area getArea() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.loveuba.tryoneapplication.data.models.AwayTeam component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.loveuba.tryoneapplication.data.models.AwayTeam getAwayTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.loveuba.tryoneapplication.data.models.Competition component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.loveuba.tryoneapplication.data.models.Competition getCompetition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.loveuba.tryoneapplication.data.models.HomeTeam component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.loveuba.tryoneapplication.data.models.HomeTeam getHomeTeam() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastUpdated() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getMatchday() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.loveuba.tryoneapplication.data.models.Odds component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.loveuba.tryoneapplication.data.models.Odds getOdds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.loveuba.tryoneapplication.data.models.Referee> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.loveuba.tryoneapplication.data.models.Referee> getReferees() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.loveuba.tryoneapplication.data.models.Score component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.loveuba.tryoneapplication.data.models.Score getScore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.loveuba.tryoneapplication.data.models.Season component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.loveuba.tryoneapplication.data.models.Season getSeason() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUtcDate() {
        return null;
    }
}