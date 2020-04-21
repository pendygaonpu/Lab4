package com.example.lab4.ThirdTask


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.lab4.R
import kotlinx.android.synthetic.main.fragment_task3.*

@Suppress("DEPRECATION")
class FragmentTwo : Fragment() {

    //this method called to display in a fragment a particular layout
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_task3, container, false)
    }

    //access UI elements and modify data
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Upload a picture to ImageView for a fragment
        imageView.setImageResource(R.drawable.foto2)
        //Background color change
        view.setBackgroundColor(getResources().getColor(R.color.colorFragmentTwo))
    }



}
