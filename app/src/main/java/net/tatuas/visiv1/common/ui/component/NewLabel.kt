package net.tatuas.visiv1.common.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.tatuas.visiv1.R

@Composable
fun NewLabel(
  modifier: Modifier = Modifier,
) {
  Box(
    modifier = modifier,
  ) {
    Text(
      text = stringResource(R.string.label_new),
      style = MaterialTheme.typography.bodySmall.copy(color = Color.White),
      modifier = Modifier
        .drawBehind {
          val px = 8.dp.toPx()

          drawRoundRect(
            color = Color.Red,
            cornerRadius = CornerRadius(px),
          )
        }
        .padding(4.dp),
    )
  }
}

@Preview
@Composable
private fun NewLabelPreview() {
  Surface {
    NewLabel()
  }
}