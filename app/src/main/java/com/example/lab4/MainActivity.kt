package com.example.lab4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.lab4.FirstTask.FirstTask
import com.example.lab4.SecondTask.SecondTask
import com.example.lab4.ThirdTask.ThirdTask

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        when ((view as Button).id) {
            //Opens activity for task1. Layout of 4 fragments, using an alternative layout of the layout of fragments
            R.id.buttonTask1 -> startActivity(Intent(this, FirstTask::class.java))
            //Opens activity for task2. Activity has 2 fragments. Clicking on TextView in the list in the second snippet opens a snippet from WebView
            R.id.buttonTask2 -> startActivity(Intent(this, SecondTask::class.java))
            //Opens activity for a task3. Using the ViewPager TabLayout widgets
            R.id.buttonTask3 -> startActivity(Intent(this, ThirdTask::class.java))
        }
    }
}
