package com.example.textcomposeandlifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.ReportDrawn
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
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
                    Text("Text with color Red", color = Color.Red, fontSize = 32.sp)

                    //Text with Text Style = Italic
                    Text("Italic with font size 32sp", fontStyle = FontStyle.Italic, fontSize = 32.sp)

                    //Use of font weight to make text bold
                    Text("Bold Text", fontWeight = FontWeight.Bold, fontSize = 32.sp)

                    //Text with shadow
                    Text("Text with Red Shadow",
                        style = TextStyle(
                            fontSize = 32.sp,
                            shadow = Shadow(
                                color = Color.Red, blurRadius = 3f
                            )
                        )
                    )
                    //Add multiple style to the text
                    Text(
                        buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color.Blue)) {
                                append("F")
                            }
                            append("ont ")

                            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red)) {
                                append("W")
                            }
                            append("ith ")

                            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)) {
                                append("M")
                            }
                            append("ultiple ")

                            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Green)) {
                                append("S")
                            }
                            append("tyle")
                        },
                        fontSize = 32.sp
                    )

                    //Brush for text Styling
                    val gradientCol = listOf(Color.Red,Color.Blue,Color.Cyan,Color.Gray)
                    Text(
                        text = "Brush for Text Styling",
                        style = TextStyle(
                            brush = Brush.linearGradient(
                                colors = gradientCol
                            )
                        ),
                        fontSize = 32.sp
                    )

                    //Integration of Brush with multiple Line of Text
                    val rainbowColor = listOf(Color.Red,Color.Blue,Color.Cyan,Color.Gray)
                    Text(
                        text = buildAnnotatedString {
                            append("Do not allow people to dim your shine\n")
                            withStyle(
                                SpanStyle(
                                    brush = Brush.linearGradient(
                                        colors = rainbowColor
                                    )
                                )
                            ) {
                                append("because they are blinded.")
                            }
                            append("\nTell them to put some sunglasses on.")
                        },
                        fontSize = 20.sp
                    )
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