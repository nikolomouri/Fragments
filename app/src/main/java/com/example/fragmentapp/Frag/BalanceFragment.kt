package com.example.fragmentapp.Frag

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragmentapp.R

class BalanceFragment : Fragment(R.layout.balance_frag) {
    private lateinit var textV1 :TextView
    private lateinit var textV2 :TextView
    private lateinit var textV3: TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textV1 = view.findViewById(R.id.tV1)
        textV1.text = BalanceFragmentArgs.fromBundle(requireArguments()).editTN
        textV2 = view.findViewById(R.id.tV3)
        textV3 = view.findViewById(R.id.tV4)
        view.findViewById<ImageView>(R.id.iV).setImageResource(R.drawable.money)
        if ( textV1.text == "None" ) {
            Toast.makeText(this.context , "First Verify on Home Page", Toast.LENGTH_LONG).show()
            textV2.text = ""
            textV3.text = ""
            textV1.text = ""
            view.findViewById<ImageView>(R.id.iV).setImageResource(R.drawable.bomji)
        }
    }
}