package mkn.basicstatecodelab.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import mkn.basicstatecodelab.components.StatefulCounter
import mkn.basicstatecodelab.components.WellnessTasksList


@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    viewModel: WellnessViewModel = viewModel()
) {
    Column {
        StatefulCounter(modifier)

        WellnessTasksList(
            list = viewModel.tasks,
            onCheckedTask = viewModel::changeTaskChecked,
            onCloseTask = viewModel::remove
        )
    }
}

