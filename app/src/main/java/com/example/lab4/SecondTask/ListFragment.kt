package com.example.lab4.SecondTask

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lab4.R
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment() {

    lateinit var mListener: OnFragmentInteractionListener

    //this method called to display in a fragment a particular layout
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }


    //access UI elements and describe click handlers
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Click handler for each list item
        googleTextView.setOnClickListener {
            loadUrl("https://www.google.com/")
        }

        facebookTextView.setOnClickListener {
            loadUrl("https://www.facebook.com/")
        }

        twitterTextView.setOnClickListener {
            loadUrl("https://www.twitter.com/")
        }

        xda_developerTextView.setOnClickListener {
            loadUrl("https://www.xda-developers.com/")
        }
    }

    //Create an instance of OnFragmentInteractionListener
    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            mListener = context as OnFragmentInteractionListener
        } catch (e: ClassCastException) {
            throw ClassCastException(
                "$context должен реализовывать интерфейс OnFragmentInteractionListener"
            )
        }
    }

    // Upload url to another fragment
    private fun loadUrl(url:String){
        mListener.onFragmentInteraction(url)
    }
}