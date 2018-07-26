package com.example.betom.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.betom.swoosh.R
import com.example.betom.swoosh.Utilities.EXTRA_LEAGUE
import com.example.betom.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill league near you..."
    }
}
