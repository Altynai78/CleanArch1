package com.example.homwork2.domain.repositories

import com.example.homwork2.domain.models.Music
import java.util.concurrent.Flow

interface MusicRepository {
    fun addMusic(music: Music) : Flow<Resource<Unit>>

    fun getMusic(): Flow<Resource<List<Music>>>

    fun getMusicByPerfomer(): Flow<Resource<List<Music>>>

    fun getMusicByDuration(): Flow<Resource<List<Music>>>

    fun updateMusic(music: Music) : Flow<Resource<Unit>>

    fun deleteMusic(music: Music) : Flow<Resource<Unit>>
}