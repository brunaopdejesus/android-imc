package com.example.relativelayoutapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.relativelayoutapplication.R

class HistoricoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historico)

        supportActionBar!!.hide()

    }
}