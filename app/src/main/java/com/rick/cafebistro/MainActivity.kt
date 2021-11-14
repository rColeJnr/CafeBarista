package com.rick.cafebistro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.navigation.NavigationView
import com.rick.cafebistro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_burger)

        // navigation
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment)
            as NavHostFragment
        navController = navHostFragment.navController

        binding.navigationView.setNavigationItemSelectedListener (object: NavigationView.OnNavigationItemSelectedListener{
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId){
                    R.id.nav_main -> {
                        if (navController.currentDestination?.label == "MainScreenFragment") return false
                        else navController.navigate(R.id.mainScreenFragment)
                        binding.drawerLayout.close()
                    }
                    R.id.nav_stock -> {
                        if (navController.currentDestination?.label == "StockManagementFragment") return false
                        else navController.navigate(R.id.stockManagementFragment)
                        binding.drawerLayout.close()
                    }
                    R.id.nav_reg -> {
                        if (navController.currentDestination?.label == "ClientRegistrationFragment") return false
                        else navController.navigate(R.id.clientRegistrationFragment)
                        binding.drawerLayout.close()
                    }
                }
                return true
            }
        })

    }

    override fun onSupportNavigateUp(): Boolean {
        if (navController.currentDestination?.label == "MainScreenFragment")
            findViewById<DrawerLayout>(R.id.drawerLayout).open()
        else navController.navigateUp()
        return true
    }
}