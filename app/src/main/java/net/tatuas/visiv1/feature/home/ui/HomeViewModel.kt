package net.tatuas.visiv1.feature.home.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
  private val _uiState: MutableStateFlow<HomeUiState> = MutableStateFlow(HomeUiState(""))
  val uiState = _uiState.asStateFlow()

  private val _uiAction: MutableSharedFlow<HomeUiAction> = MutableSharedFlow()
  val uiAction = _uiAction.asSharedFlow()

  init {
    viewModelScope.launch {
      delay(100)
      _uiState.update { HomeUiState("太郎") }
      delay(1000)
      _uiAction.emit(OpenCampaignOneDialog)
    }
  }
}
