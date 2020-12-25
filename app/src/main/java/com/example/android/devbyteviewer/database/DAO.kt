package com.example.android.devbyteviewer.database

import android.provider.MediaStore
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DAO {

    @Query("SELECT * FROM databaseVideo")
    suspend fun getVideos(): LiveData<List<databaseVideo>>
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(video: databaseVideo)
}