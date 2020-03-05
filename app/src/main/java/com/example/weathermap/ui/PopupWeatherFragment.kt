package com.example.weathermap.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.weathermap.R
import kotlinx.android.synthetic.main.fragment_popup_weather.*

/**
 * A simple [Fragment] subclass.
 */
class PopupWeatherFragment : Fragment() {
    lateinit var img: ImageView
    lateinit var context: AppCompatActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View? = inflater.inflate(R.layout.fragment_popup_weather, container, false)
        ic_close?.setOnClickListener {
            Log.e("ololo", "hello")
            Toast.makeText(context, "Hello", Toast.LENGTH_LONG).show()
//            val fm = context.supportFragmentManager
//            val fragmentTransaction: FragmentTransaction
//            val fragment = PopupWeatherFragment()
//            fragmentTransaction = fm.beginTransaction()
//            fragmentTransaction.hide(fragment)
//                .addToBackStack(null)
//                .set
//            fragmentTransaction.commit()
        }
        return view
    }

}
