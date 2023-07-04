package com.example.homwork2.domain.di

import android.content.Context
import androidx.room.Room
import com.example.homwork2.data.local.MusicDao
import com.example.homwork2.data.local.MusicDataBase
import com.example.homwork2.data.repository.MusicRepositoryImpl


@Module
@InstallIn(SingletonComponent::class)
object MusicModule {

    @Singleton
    @Provides
    fun provideMusicDataBase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        MusicDataBase::class.java,
        "musics"
    )

    @Provides
    fun provideMusicDao(musicDataBase: MusicDataBase) = musicDataBase.musicDao()

    @Provides
    fun provideMusicRepository(musicDao: MusicDao) = MusicRepositoryImpl(musicDao)
}