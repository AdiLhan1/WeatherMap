package com.example.weathermap.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.weathermap.R
import kotlinx.android.synthetic.main.fragment_popup_weather.*

/**
 * A simple [Fragment] subclass.
 */
class PopupWeatherFragment : Fragment() {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        ic_close.setOnClickListener {
            val fm = activity?.supportFragmentManager
            val transaction = fm?.beginTransaction()
            transaction?.remove(this)
            transaction?.commit()
            Toast.makeText(context, "Closed", Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View? = inflater.inflate(R.layout.fragment_popup_weather, container, false)
        return view
    }

}
