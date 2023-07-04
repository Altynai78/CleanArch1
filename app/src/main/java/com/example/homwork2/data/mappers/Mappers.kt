package com.example.homwork2.data.mappers

import com.example.homwork2.data.models.MusicEntity


fun MusicEntity.toMusic() = Music(id, name, perfomer, album, duration)

fun Music.toMusicEntity() = MusicEntity(id, name, perfomer, album, duration)