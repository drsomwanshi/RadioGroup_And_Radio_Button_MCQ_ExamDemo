package com.example.examdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ckeck(view: View) {

        var r3=findViewById(R.id.r3) as RadioButton;
        if(r3.isChecked==true) {
            Toast.makeText(
                this,
                "Congratulation", Toast.LENGTH_LONG
            ).show();
            var la=findViewById(R.id.lay1) as LinearLayout;
            la.setBackgroundColor(Color.BLUE);
        }
        else
            Toast.makeText(this,
                "Wrong Answer",Toast.LENGTH_LONG).show();

    }
}