package com.example.weathermap

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNavigationView();
    }

    private fun setupNavigationView() {
        navigation_view.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.n_map -> {
                    setSelectFragment()
                    true
                }
                R.id.n_city_search -> {
                    true
                }
                R.id.n_profile -> {
                    true
                }
                else -> false
            }
        }
    }

    private fun setSelectFragment(fr: Fragment? = null) {
        fr?.let { supportFragmentManager.beginTransaction().add(R.id.main_fragment, it).commit() }
    }
}
