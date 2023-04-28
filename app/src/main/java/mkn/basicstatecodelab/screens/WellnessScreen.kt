package mkn.basicstatecodelab.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import mkn.basicstatecodelab.components.StatefulCounter
import mkn.basicstatecodelab.components.WellnessTasksList
import mkn.basicstatecodelab.models.WellnessTask

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column {
        StatefulCounter(modifier)

        val list = remember { mutableStateListOf<WellnessTask>().apply { addAll(getWellnessTasks()) } }
        WellnessTasksList(list = list, onCloseTask = { task -> list.remove(task) })
    }
}

private fun getWellnessTasks() = List(30) { i -> WellnessTask(id = i, label = "Task # $i") }
