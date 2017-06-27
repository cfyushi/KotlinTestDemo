package com.cfyushi.kotlindemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_test.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.makeCall
import org.jetbrains.anko.share

class IntentTestActivity : AppCompatActivity() ,AnkoLogger{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_test)
        val intent:Bundle  = getIntent().extras
        val id = intent?.getInt("id")?:-1
        info { "id " + id }
        intent_start_activity.setOnClickListener {

        }

        intent_make_a_call.setOnClickListener {
            makeCall("12345678")
        }

        intent_share_text.setOnClickListener {
            share("11111111111111111111")
        }
    }
}
