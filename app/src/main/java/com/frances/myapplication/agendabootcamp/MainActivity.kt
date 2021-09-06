package com.frances.myapplication.agendabootcamp

import android.content.Intent
import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.provider.CalendarContract.Events.*
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSetEvent = findViewById(R.id.set_event) as Button

        //quando a gente apertar o botao
        //ele vai escrever esse evento para ser
        //add na agenda
        btnSetEvent.setOnClickListener {

            val intent= Intent(Intent.ACTION_INSERT)
                .setData(CONTENT_URI)
                .putExtra(TITLE,"Bootcam everis")
                .putExtra(EVENT_LOCATION,"online")
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME,System.currentTimeMillis()+(60*60*1000))

            startActivity(intent)


        }
    }
}