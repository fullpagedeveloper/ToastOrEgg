package com.fullpagedeveloper.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fullpagedeveloper.toastegg.toastOrEgg
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Toast.setOnClickListener {
            toastOrEgg( "Anjayyyyy", 1, R.color.design_default_color_primary_variant)
        }

        btn_ToastRes.setOnClickListener {
            toastOrEgg( "Gokilllll", 0, R.color.black, R.color.white, R.drawable.ic_baseline_lock_24)
        }

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, BlankFragment())
            commit()
        }
    }
}