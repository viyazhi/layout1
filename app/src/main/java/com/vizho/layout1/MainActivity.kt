package com.vizho.layout1

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var name: EditText? = null
    var city: EditText? = null
    var college: EditText? = null
    var check: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.enterYourName)
        city = findViewById(R.id.enterYourCity)
        college = findViewById(R.id.enterYourCollegeName)
        check = findViewById(R.id.check)
        check?.setOnClickListener {


            Toast.makeText(
                this,
                "Button is pressed $ {name?.text, city?.text,college?.text} ",
                Toast.LENGTH_SHORT
            )
        }
            /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
    }
}