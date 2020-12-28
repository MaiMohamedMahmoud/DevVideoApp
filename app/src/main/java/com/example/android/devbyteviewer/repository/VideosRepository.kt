/*
 * Copyright (C) 2019 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.devbyteviewer.repository


import android.provider.MediaStore
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.android.devbyteviewer.database.VideoDatabase
import com.example.android.devbyteviewer.database.asDomainModel
import com.example.android.devbyteviewer.database.databaseVideo
import com.example.android.devbyteviewer.domain.DevByteVideo
import com.example.android.devbyteviewer.network.DevByteNetwork.devbytes
import com.example.android.devbyteviewer.network.asDatabaseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class VideosRepository(private val database: VideoDatabase) {
    /**
     * this can be used by everyone to observe videos
     */

    val videos:LiveData<List<DevByteVideo>> = Transformations.map( database.dao.getVideos()){
        it.asDomainModel()
    }
    /**
     * here in this repository we want we want
     * 1- fun to update (refresh) the db cash
     * 2- fun get data from cash db.
     */
    suspend fun refreshDatabase() {
        //get the data from network (API)
        withContext(Dispatchers.IO) {
            val videoList = devbytes.getPlaylist()
            database.dao.insertAll(*videoList.asDatabaseModel())
        }

    }

}