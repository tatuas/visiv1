package net.tatuas.visiv1.common.ext

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

fun AppCompatActivity.findNavControllerBy(fragmentContainerView: FragmentContainerView): NavController {
  val navHostFragment =
    supportFragmentManager.findFragmentById(fragmentContainerView.id) as NavHostFragment
  return navHostFragment.findNavController()
}
