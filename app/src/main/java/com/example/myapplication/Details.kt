package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val image=intent.getIntExtra("image",0);
        val title=intent.getStringExtra("title")
        val ratting=intent.getStringExtra("rating")
        val desc=intent.getStringExtra("des")


        findViewById<ImageView>(R.id.imageD).setImageResource(image)
        findViewById<TextView>(R.id.titleD).text=title
        findViewById<TextView>(R.id.rattingD).text=ratting
        findViewById<TextView>(R.id.textView4).text=desc


    }
}