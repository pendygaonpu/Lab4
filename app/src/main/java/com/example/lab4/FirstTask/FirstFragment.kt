package com.example.lab4.FirstTask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lab4.R

class FirstFragment : Fragment() {

    //this method called to display in a fragment a particular layout
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

}
