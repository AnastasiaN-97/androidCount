package com.example.count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object {
        const val COUNT_KEY = "COUNT_KEY"
    }

    private  var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MyTag", "onCreate")

        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = count.toString()

        val addButton: Button = findViewById(R.id.button)

        addButton.setOnClickListener {
            ++count
            resultTextView.text = count.toString()
        }

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        count = savedInstanceState.getInt(COUNT_KEY)
        Log.d("MyTag", "onRestoreInstanceState")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(COUNT_KEY, count)
        Log.d("MyTag", "onSavedInstanceState")
    }

}




