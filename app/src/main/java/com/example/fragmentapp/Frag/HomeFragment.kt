package com.example.fragmentapp.Frag

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.fragmentapp.R

class HomeFragment : Fragment(R.layout.home_frag) {
    private lateinit var amountEditText: EditText
    private lateinit var sendButton: Button
    private lateinit var editTextName :EditText
    private lateinit var editTextPass:EditText
    private lateinit var check :Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        amountEditText = view.findViewById(R.id.editTextAmount)
        sendButton = view.findViewById(R.id.sendB)
        editTextName= view.findViewById(R.id.editTextName)
        editTextPass= view.findViewById(R.id.editTextPass)
        check= view.findViewById(R.id.checkB)
        val navController = Navigation.findNavController(view)
        sendButton.setOnClickListener{
            val amountText = amountEditText.text.toString()
            if (amountText.isEmpty()){
                return@setOnClickListener
            }
            val amount = amountText.toInt()
            val action = HomeFragmentDirections.actionHomeFragmentToDashboardFrag(amount)
            navController.navigate(action)
        }
        check.setOnClickListener {
            var editTN = editTextName.text.toString()
            var editTP = editTextPass.text.toString()
            if ((editTN.length > 3) && (editTP.length>8)) {
                Toast.makeText(this.context, "Verified", Toast.LENGTH_LONG).show()
                view.findViewById<Button>(R.id.bt1).visibility = View.VISIBLE
            } else {
                Toast.makeText(this.context, "Try again", Toast.LENGTH_LONG).show()
            }
        }
        view.findViewById<Button>(R.id.bt1).setOnClickListener{
            var editTN = editTextName.text.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToBalanceFragment(editTN)
            navController.navigate(action)
        }
    }
}