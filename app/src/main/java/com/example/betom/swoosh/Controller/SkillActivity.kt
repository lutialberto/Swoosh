package com.example.betom.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.betom.swoosh.Model.Player
import com.example.betom.swoosh.R
import com.example.betom.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    val NO_SKILL_CHOISE = ""
    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onSkillFinishClicked(view: View){
        if(player.skill != NO_SKILL_CHOISE) {
            val finishActivity = Intent(this, FinalActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this,"Plaese select a skill level.",Toast.LENGTH_SHORT).show()
        }
    }

    fun onSkillBallerClick(view: View){
        if(skillBallerButton.isChecked) {
            skillBeginnerButton.isChecked = false
            player.skill = "baller"
        } else
            player.skill = NO_SKILL_CHOISE
    }

    fun onSkillBegginerClick(view: View){
        if(skillBeginnerButton.isChecked) {
            skillBallerButton.isChecked = false
            player.skill = "beginner"
        } else
            player.skill = NO_SKILL_CHOISE
    }

}
