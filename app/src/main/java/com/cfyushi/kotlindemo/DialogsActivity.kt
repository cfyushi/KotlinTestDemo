package com.cfyushi.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dialogs.*
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.Appcompat

class DialogsActivity : AppCompatActivity(), AnkoLogger {

    private var mToast: Toast? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialogs)

        dialogs_toast.setOnClickListener {
            //快速多次点击，toast不消失，此方法不推荐
            longToast("" + 1.0)
        }

        dialogs_alerts.setOnClickListener {
            alert("hi,roy", "have you tried") {
                yesButton { info { "dialogs_alerts yesButton" } }
                noButton { info { "dialogs_alerts noButton" } }
            }.show()
        }

        dialogs_alerts_Appcompat.setOnClickListener {
            alert(Appcompat, "some text message").show()
        }
        dialogs_alerts_customView.setOnClickListener {
            alert {
                customView { editText() }
            }.show()
        }
        dialogs_selectors.setOnClickListener {
            val countries = listOf("Russia", "USA", "Japan", "Australia")
            selector("where are from",countries){
                dialogInterface, i ->  info { "So you are living in ${countries[i]}" }
            }
        }
        dialogs_progress.setOnClickListener {
            val dialog = progressDialog(message = "Please wait a bit…", title = "Fetching data")
            dialog.show()
        }
    }


}
