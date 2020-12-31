package com.example.android.devbyteviewer.work

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.example.android.devbyteviewer.database.getInstance
import com.example.android.devbyteviewer.repository.VideosRepository
import retrofit2.HttpException

class RefreshDataWorker(appContext: Context, params: WorkerParameters) : CoroutineWorker(appContext, params) {

    companion object Work {
        const val work_name: String = "Work_Name"
    }

    override suspend fun doWork(): Result {
        val database = getInstance(applicationContext)
        val repository = VideosRepository(database)
        return try {
            repository.refreshDatabase()
            Result.success()
        } catch (e: HttpException) {
            Result.retry()
        }
    }
}