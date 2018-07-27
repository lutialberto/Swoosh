package com.example.betom.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.example.betom.swoosh.Model.Player
import com.example.betom.swoosh.R
import com.example.betom.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    val NO_LEAGUE_CHOISE = ""

    var player = Player ("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player=savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun leagueNextClicked(view: View){
        if(player.league != NO_LEAGUE_CHOISE) {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this,"please select a league.",Toast.LENGTH_SHORT).show()
        }
    }

    fun onMensClicked(view: View){
        if(mensLeagueButton.isChecked) {
            womensLeagueButton.isChecked = false
            coEdLeagueButton.isChecked = false

            player.league = "mens"
        }else
            player.league=NO_LEAGUE_CHOISE
    }

    fun onWomensClicked(view: View){
        if(womensLeagueButton.isChecked) {
            mensLeagueButton.isChecked = false
            coEdLeagueButton.isChecked = false

            player.league = "womens"
        }else
            player.league=NO_LEAGUE_CHOISE
    }

    fun onCoEdClicked(view: View){
        if(coEdLeagueButton.isChecked) {
            mensLeagueButton.isChecked = false
            womensLeagueButton.isChecked = false

            player.league = "co-ed"
        }else
            player.league=NO_LEAGUE_CHOISE
    }

}
