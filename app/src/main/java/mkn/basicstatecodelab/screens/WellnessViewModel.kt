package mkn.basicstatecodelab.screens

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import mkn.basicstatecodelab.models.WellnessTask

class WellnessViewModel: ViewModel() {
    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask> = _tasks

    fun remove(task: WellnessTask) {
        _tasks.remove(task)
    }

    fun changeTaskChecked(task: WellnessTask, checked: Boolean) {
        tasks.find { it.id == task.id }?.let { task ->
            task.checked = checked
        }
    }
}

private fun getWellnessTasks() = List(30) { i -> WellnessTask(id = i, label = "Task # $i") }
