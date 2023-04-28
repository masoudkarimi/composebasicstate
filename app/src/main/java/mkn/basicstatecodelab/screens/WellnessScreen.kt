package mkn.basicstatecodelab.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import mkn.basicstatecodelab.components.StatefulCounter
import mkn.basicstatecodelab.components.WellnessTasksList

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column {
        StatefulCounter(modifier)
        WellnessTasksList()
    }
}