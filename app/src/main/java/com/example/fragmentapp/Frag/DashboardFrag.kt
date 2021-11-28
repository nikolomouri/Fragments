package com.example.fragmentapp.Frag

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmentapp.R

class DashboardFrag : Fragment(R.layout.dashboard_frag) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.tV).text =
                    DashboardFragArgs.fromBundle(requireArguments()).amount.toString()
    }
}