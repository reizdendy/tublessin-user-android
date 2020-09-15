package com.example.final_project.screen

import android.content.ContextWrapper
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.final_project.R
import com.pixplicity.easyprefs.library.Prefs
import kotlinx.android.synthetic.main.fragment_find_near_by_montir.*

class FindNearByMontirFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_find_near_by_montir, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Prefs.Builder()
            .setContext(this.activity)
            .setMode(ContextWrapper.MODE_PRIVATE)
            .setPrefsName(this.activity?.packageName)
            .setUseDefaultSharedPreference(true)
            .build()

        latitude.text = Prefs.getString("userLatitude", "0")
        longitude.text = Prefs.getString("userLongitude", "0")
    }
}