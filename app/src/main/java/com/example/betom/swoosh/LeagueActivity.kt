package com.example.betom.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    val NO_CHOISE = ""

    var selectedLeague = NO_CHOISE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View){
        if(selectedLeague != NO_CHOISE) {
            val skillActivity = Intent(this, SkillActivity::class.java)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this,"please select a league.",Toast.LENGTH_SHORT).show()
        }
    }

    fun onMensClicked(view: View){
        if(mensLeagueButton.isChecked) {
            womensLeagueButton.isChecked = false
            coEdLeagueButton.isChecked = false

            selectedLeague = "mens"
        }else
            selectedLeague=NO_CHOISE
    }

    fun onWomensClicked(view: View){
        if(womensLeagueButton.isChecked) {
            mensLeagueButton.isChecked = false
            coEdLeagueButton.isChecked = false

            selectedLeague = "womens"
        }else
            selectedLeague=NO_CHOISE
    }

    fun onCoEdClicked(view: View){
        if(coEdLeagueButton.isChecked) {
            mensLeagueButton.isChecked = false
            womensLeagueButton.isChecked = false

            selectedLeague = "co-ed"
        }else
            selectedLeague=NO_CHOISE
    }

}
