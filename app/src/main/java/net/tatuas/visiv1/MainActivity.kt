package net.tatuas.visiv1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.ui.setupWithNavController
import net.tatuas.visiv1.common.ext.findNavControllerBy
import net.tatuas.visiv1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

  private lateinit var navController: NavController

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(binding.root)
    navController = findNavControllerBy(binding.fragmentContainerView)
    binding.bottomNavigationView.setupWithNavController(navController)
  }
}
