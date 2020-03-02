package com.example.weathermap

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNavigationView();
    }

    private fun setupNavigationView() {
        navigation_view.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.n_map -> {
                    setSelectFragment()
                }
                R.id.n_city_search -> {

                }
                R.id.n_profile -> {

                }
            }
        }
    }

    private fun setSelectFragment() {
        supportFragmentManager.beginTransaction().add(R.id.main_fragment,it)
    }
}
