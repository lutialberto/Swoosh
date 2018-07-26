package com.example.betom.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.betom.swoosh.Utilities.EXTRA_LEAGUE
import com.example.betom.swoosh.R
import com.example.betom.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onSkillFinishClicked(view: View){
        if(skill != "") {
            val finishActivity = Intent(this, FinalActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this,"Plaese select a skill level.",Toast.LENGTH_SHORT).show()
        }
    }

    fun onSkillBallerClick(view: View){
        if(skillBallerButton.isChecked) {
            skillBeginnerButton.isChecked = false
            skill = "baller"
        } else
            skill = ""
    }

    fun onSkillBegginerClick(view: View){
        if(skillBeginnerButton.isChecked) {
            skillBallerButton.isChecked = false
            skill = "beginner"
        } else
            skill = ""
    }

}
