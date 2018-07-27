package com.example.betom.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.betom.swoosh.Model.Player
import com.example.betom.swoosh.R
import com.example.betom.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
