package net.tatuas.visiv1.feature.home.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import net.tatuas.visiv1.R

@Composable
fun HomeTitle(
  name: String,
  modifier: Modifier = Modifier,
) {
  Column(
    verticalArrangement = Arrangement.spacedBy(8.dp),
    modifier = modifier,
  ) {
    Text(
      text = stringResource(R.string.home_feature_name),
      style = MaterialTheme.typography.titleLarge,
    )
    Text(
      text = stringResource(R.string.home_sub_title, name),
      style = MaterialTheme.typography.bodySmall,
    )
  }
}

@Preview
@Composable
private fun HomeTitlePreview(
  @PreviewParameter(HomeTitlePreviewProvider::class)
  parameter: HomeTitlePreviewProvider.Parameter
) {
  Surface {
    HomeTitle(parameter.name)
  }
}

private class HomeTitlePreviewProvider :
  PreviewParameterProvider<HomeTitlePreviewProvider.Parameter> {

  override val values = sequenceOf(
    Parameter("Hiroshi"),
    Parameter("Akiko")
  )

  data class Parameter(
    val name: String
  )
}
