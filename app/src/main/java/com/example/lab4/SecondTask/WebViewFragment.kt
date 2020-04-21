package com.example.lab4.SecondTask

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lab4.R
import kotlinx.android.synthetic.main.fragment_webview.*

class WebViewFragment : Fragment() {

    //this method called to display in a fragment a particular layout
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_webview, container, false)
    }

    //method that fetches a URL
    fun loadUrl(url: String){
        webView.loadUrl(url)
    }
}