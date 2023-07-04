package com.example.homwork2.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.homwork2.data.models.MusicEntity

@Database(entities = [MusicEntity::class], version = 1)
abstract class MusicDataBase: RoomDatabase() {
    abstract fun musicDao(): MusicDao
}