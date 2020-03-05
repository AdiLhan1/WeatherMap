package com.example.weathermap.ui

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.weathermap.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapFragment : Fragment(), GoogleMap.OnMapClickListener, OnMapReadyCallback,
    GoogleMap.OnCameraMoveListener, GoogleMap.OnCameraIdleListener {
    private lateinit var googleMap: GoogleMap
    lateinit var context: AppCompatActivity
    private lateinit var mapFragment: SupportMapFragment

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.context = context as AppCompatActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view: View? = inflater.inflate(R.layout.fragment_map, container, false)
        setupMap()
        return view
    }

    private fun setupMap() {
        mapFragment = SupportMapFragment.newInstance()
        fragmentManager?.beginTransaction()?.add(R.id.linear_container, mapFragment)?.commit()
        mapFragment.getMapAsync(this)

    }

    @SuppressLint("ShowToast")
    override fun onMapClick(p0: LatLng?) {
        Toast.makeText(activity, p0?.latitude.toString(), Toast.LENGTH_LONG).show()
    }

    fun transactions() {
        val fm = context.supportFragmentManager
        val fragmentTransaction: FragmentTransaction
        val fragment = PopupWeatherFragment()
        fragmentTransaction = fm.beginTransaction()
        fragmentTransaction.add(R.id.weather_container, fragment)
            .addToBackStack(null)
        fragmentTransaction.commit()
    }

    override fun onMapReady(p0: GoogleMap) {
        googleMap = p0
        val bishkek = LatLng(42.882004, 74.582748)
        googleMap.addMarker(MarkerOptions().position(bishkek).title("Bishkek"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(bishkek))
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(bishkek, 15f))

        googleMap.setOnMapClickListener {
            transactions()
        }
    }

    override fun onCameraMove() {
    }

    override fun onCameraIdle() {

    }
}
