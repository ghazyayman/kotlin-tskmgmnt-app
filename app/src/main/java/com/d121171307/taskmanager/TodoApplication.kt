package com.d121171307.taskmanager

import android.app.Application

class TodoApplication : Application()
{
    private val database by lazy { TaskItemDatabase.getDatabase(this) }
    val repository by lazy { TaskItemRepository(database.taskItemDao()) }
}