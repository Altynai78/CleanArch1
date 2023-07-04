package com.example.homwork2.domain.useCases

import com.example.homwork2.domain.models.Music
import com.example.homwork2.domain.repositories.MusicRepository

class DeleteMusicUseCase @Inject constructor(
    private val musicRepository: MusicRepository
) {
    fun deleteMusic(music: Music) {
        musicRepository.deleteMusic(music)
    }
}