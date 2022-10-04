package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val tag="DEBUG_TAG"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var llist = ArrayList<String>(arrayListOf("Hamburger", "Pizza",
            "Mexican", "American", "Chinese"))

        bt1.setOnClickListener {
            val adding=et.text
            Log.d(tag, adding.toString())
            llist.add(adding.toString())
            Snackbar.make(it, "${adding.toString()} added", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        bt2.setOnClickListener {
            val randomElement = llist.random()
            tv.text=randomElement
        }

    }
}