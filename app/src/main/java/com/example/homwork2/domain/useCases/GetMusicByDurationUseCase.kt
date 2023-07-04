package com.example.homwork2.domain.useCases

import com.example.homwork2.domain.models.Music
import com.example.homwork2.domain.repositories.MusicRepository
import java.util.concurrent.Flow

class GetMusicByDurationUseCase@Inject constructor(
    private val musicRepository: MusicRepository
) {
    fun getMusicByDuration(): Flow<Resource<List<Music>>> {
        return musicRepository.getMusicByDuration()
    }
}
