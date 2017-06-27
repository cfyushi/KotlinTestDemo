package com.cfyushi.kotlindemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        demo_intent.setOnClickListener {
            val intent: Intent = intentFor<IntentTestActivity>("id" to 5).noAnimation().singleTop()
            startActivity(intent)
            info {
                "demo_intent"
            }
        }

        demo_dialogs.setOnClickListener {
            startActivity(intentFor<DialogsActivity>())
        }
    }
}
