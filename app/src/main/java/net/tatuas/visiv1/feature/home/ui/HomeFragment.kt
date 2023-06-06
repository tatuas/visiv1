package net.tatuas.visiv1.feature.home.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.launch
import net.tatuas.visiv1.R
import net.tatuas.visiv1.common.ui.theme.Visiv1Theme

class HomeFragment : Fragment() {

  private val viewModel by viewModels<HomeViewModel>()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View = ComposeView(requireContext())
    .apply {
      setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
      setContent {
        val uiState by viewModel.uiState.collectAsStateWithLifecycle()

        Visiv1Theme {
          HomeScreen(
            uiState = uiState,
            modifier = Modifier.fillMaxSize(),
          )
        }
      }
    }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    viewLifecycleOwner.lifecycleScope.launch {
      repeatOnLifecycle(Lifecycle.State.STARTED) {
        viewModel.uiAction.collect { uiAction ->
          when (uiAction) {
            OpenCampaignOneDialog -> findNavController().navigate(R.id.dialog_campaign_one)
          }
        }
      }
    }
  }
}
