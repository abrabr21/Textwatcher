package com.example.textwatcher.screens

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.textwatcher.MAIN
import com.example.textwatcher.R
import com.example.textwatcher.databinding.FragmentSecondBinding
import com.example.textwatcher.screens.FirstFragment


class SecondFragment : Fragment() {

    lateinit var binding: FragmentSecondBinding
    lateinit var firstF: FirstFragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding= FragmentSecondBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.editTextNewTitle.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                MAIN.title=s
            }
        })

        binding.btnBack.setOnClickListener{
            MAIN.navController.navigate(R.id.action_secondFragment_to_firstFragment)
        }
    }


}