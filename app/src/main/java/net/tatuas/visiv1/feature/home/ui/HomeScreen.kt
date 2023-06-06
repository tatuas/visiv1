package net.tatuas.visiv1.feature.home.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.tatuas.visiv1.common.ui.component.NewLabel
import net.tatuas.visiv1.feature.home.ui.component.HomeTitle

@Composable
fun HomeScreen(
  uiState: HomeUiState,
  modifier: Modifier = Modifier,
) {
  Surface(
    modifier = modifier,
  ) {
    Box(
      modifier = Modifier.padding(16.dp),
    ) {
      HomeTitle(
        name = uiState.name
      )
      NewLabel(
        modifier = Modifier.align(Alignment.Center)
      )
    }
  }
}

@Preview
@Composable
fun HomeScreenPreview() {
  HomeScreen(
    uiState = HomeUiState("hello"),
    modifier = Modifier.fillMaxSize(),
  )
}