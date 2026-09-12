package com.poultryfoodsafety.openknowledge

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val title = TextView(this).apply {
            text = "Poultry Food Safety Open Knowledge\n\nWelcome!\n\nBroiler Processing QC Learning App"
            textSize = 22f
            setPadding(32, 64, 32, 32)
        }

        setContentView(title)
    }
}
