package com.example.homwork2.domain.useCases

import com.example.homwork2.domain.models.Music
import com.example.homwork2.domain.repositories.MusicRepository

class AddMusicUseCase @Inject constructor(
    private val musicRepository : MusicRepository
) {

    fun addMusic(music: Music) {
        musicRepository.addMusic(music)
    }

}