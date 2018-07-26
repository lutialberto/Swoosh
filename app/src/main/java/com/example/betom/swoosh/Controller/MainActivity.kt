package com.example.betom.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.example.betom.swoosh.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedButtom.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
