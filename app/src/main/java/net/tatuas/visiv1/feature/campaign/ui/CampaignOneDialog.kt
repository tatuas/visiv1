package net.tatuas.visiv1.feature.campaign.ui

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class CampaignOneDialog : DialogFragment() {
  override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
    AlertDialog.Builder(requireContext())
      .setTitle("Sale!")
      .setPositiveButton(android.R.string.ok, null)
      .create()
}
