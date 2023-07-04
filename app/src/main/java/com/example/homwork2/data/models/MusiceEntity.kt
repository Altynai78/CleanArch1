package com.example.homwork2.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "musics")
                        data class MusicEntity(
@PrimaryKey(autoGenerate = true)
val id: Int,
val name: String,
val perfomer: String,
val album: String,
val duration: String
)
