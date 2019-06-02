package com.fox.studio.testlifecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var myObserver : MyObserver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addObserver()
    }

    fun addObserver(){
        myObserver = MyObserver()
        lifecycle.addObserver(myObserver)

    }
}
