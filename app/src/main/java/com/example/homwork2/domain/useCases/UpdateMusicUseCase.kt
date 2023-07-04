package com.example.homwork2.domain.useCases

import com.example.homwork2.domain.models.Music
import com.example.homwork2.domain.repositories.MusicRepository

class UpdateMusicUseCase @Inject constructor(
    private val musicRepository: MusicRepository
) {
    fun updateMusic(music: Music) {
        musicRepository.updateMusic(music)
    }
}
