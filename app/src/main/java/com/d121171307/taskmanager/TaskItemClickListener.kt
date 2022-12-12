package com.d121171307.taskmanager

interface TaskItemClickListener
{
    fun editTaskItem(taskItem: TaskItem)
    fun completeTaskItem(taskItem: TaskItem)
}