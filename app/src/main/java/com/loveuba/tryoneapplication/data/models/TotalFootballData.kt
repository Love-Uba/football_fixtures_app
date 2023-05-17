package com.loveuba.tryoneapplication.data.models

data class TotalFootballData(
    val filters: Filters,
    val matches: List<Matches>,
    val resultSet: ResultSet
)