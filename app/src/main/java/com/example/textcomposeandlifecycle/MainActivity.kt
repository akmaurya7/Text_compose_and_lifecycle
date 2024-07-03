package com.example.textcomposeandlifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.textcomposeandlifecycle.ui.theme.TextComposeAndLifecycleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            TextComposeAndLifecycleTheme {
                Column {
                    //Simple Text
                    Text("Hello Team, how you all")

                    //Text with color red and font size 32
                    Text("Hello Team, how you all", color = Color.Red, fontSize = 32.sp)



                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        println("LifeCycle: onStart is called")
        Log.i("LifeCycle","OnStart is callie")

    }

    override fun onResume() {
        super.onResume()
        println("LifeCycle: onResume is called")
        Log.i("LifeCycle","On Resume is callie")

    }

    override fun onPause() {
        super.onPause()
        println("LifeCycle: onStart is called")
        Log.i("LifeCycle","Onpause is callie")

    }
    override fun onStop() {
        super.onStop()
        println("LifeCycle: onStart is called")
        Log.i("LifeCycle","OnStop is callie")

    }
    override fun onDestroy() {
        super.onDestroy()
        println("LifeCycle: onStart is called")
        Log.i("LifeCycle","On Destroy is callie")
    }
}