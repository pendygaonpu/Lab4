package com.example.lab4.SecondTask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab4.R

class SecondTask: AppCompatActivity(), OnFragmentInteractionListener  {


    //method for handling TextView in the fragment_list layout list
    override fun onFragmentInteraction(url: String) {
        //Fragment Management
        val fragment = supportFragmentManager
            .findFragmentById(R.id.webViewFragment) as WebViewFragment  //call the method in WebViewFragment to load the URL
        if (fragment.isInLayout) {
            fragment.loadUrl(url)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task2)
    }

}