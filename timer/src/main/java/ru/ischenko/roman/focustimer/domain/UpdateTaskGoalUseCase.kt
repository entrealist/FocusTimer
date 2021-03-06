package ru.ischenko.roman.focustimer.domain

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import ru.ischenko.roman.focustimer.data.model.Task
import ru.ischenko.roman.focustimer.data.repository.TaskRepository
import ru.ischenko.roman.focustimer.domain.error.UpdateTaskException

class UpdateTaskGoalUseCase(private val taskRepository: TaskRepository) {

    @Throws(UpdateTaskException::class)
    suspend operator fun invoke(task: Task, goal: String) = withContext(Dispatchers.IO) {
        try {
            task.goal = goal
            taskRepository.saveTask(task)
        }
        catch (e: Throwable) {
            throw UpdateTaskException("Can't update task", e)
        }
    }
}