package com.example.weathermap.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.weathermap.R
import kotlinx.android.synthetic.main.fragment_popup_weather.*

/**
 * A simple [Fragment] subclass.
 */
class PopupWeatherFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_popup_weather, container, false)
    }

}
