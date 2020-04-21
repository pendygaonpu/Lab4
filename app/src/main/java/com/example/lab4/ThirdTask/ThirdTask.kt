package com.example.lab4.ThirdTask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.lab4.R
import com.google.android.material.tabs.TabLayout




class ThirdTask: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task3)

        //get links to ViewPager and TabLayout items
        val pager: ViewPager = findViewById(R.id.viewPager)
        val tabs: TabLayout = findViewById(R.id.tabLayout)

        val adapter = MyViewPagerAdapter(supportFragmentManager) //adapter supplies the widget fragment
        //Add fragment to the adapter snippet list
        adapter.addFragment(FragmentOne(),"Tab 1")
        adapter.addFragment(FragmentTwo(),"Tab 2")
        adapter.addFragment(FragmentThree(),"Tab 3")
        pager.adapter = adapter //Assign a new adapter element
        tabs.setupWithViewPager(pager) //Setting up ViewPager and TabLayout sharing


    }

    //Fragment Management Adapter Class
    @Suppress("DEPRECATION")
    class MyViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager){

        //List of snippets
        private val fragmentList : MutableList<Fragment> = ArrayList()
        //List of snippet headers (forTabLayout)
        private val titleList : MutableList<String> = ArrayList()

        //Returns the object and something fragment
        override fun getItem(position: Int): Fragment {
            return fragmentList[position]
        }
        //Returns the number of fragments
        override fun getCount(): Int {
            return fragmentList.size
        }
        //The method of adding fragments to the list of fragments of the adapter
        fun addFragment(fragment: Fragment,title:String){
            fragmentList.add(fragment)
            titleList.add(title)
        }
        //Returns the fragment header
        override fun getPageTitle(position: Int): CharSequence? {
            return titleList[position]
        }
    }
}