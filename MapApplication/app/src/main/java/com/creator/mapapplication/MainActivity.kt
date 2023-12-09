package com.creator.mapapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.creator.mapapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    /**
     * A native method that is implemented by the 'mapapplication' native library,
     * which is packaged with this application.
     */
/*    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'mapapplication' library on application startup.
        init {
            System.loadLibrary("mapapplication")
        }
    }*/
}