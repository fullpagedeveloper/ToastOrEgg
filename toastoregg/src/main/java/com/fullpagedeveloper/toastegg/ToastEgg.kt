package com.fullpagedeveloper.toastegg

import android.content.Context
import android.content.Context.LAYOUT_INFLATER_SERVICE
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.annotation.Nullable
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.toast_egg.view.*

fun Context.toastOrEgg(
    @Nullable text: CharSequence?,
    duration: Int,
    @Nullable backgroundTint: Int?
) {
    val toastEgg = Toast.makeText(this, text, duration)
    val lengthSHORT = 0
    val lengthLONG = 1
    if (text != null) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.P) {
            toastEgg.setText(text)

        }
    }
    if (backgroundTint != null) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            toastEgg.view?.background?.setTintList(ContextCompat.getColorStateList(this, backgroundTint))
        }
    }
    if (duration == lengthSHORT){
        Toast.LENGTH_SHORT
    } else if (duration == lengthLONG){
        Toast.LENGTH_LONG
    }
    toastEgg.show()
}

fun toastOrEgg2(context: Context){
    Toast.makeText(context, "hiii", Toast.LENGTH_SHORT).show()
}

fun toastOrEgg2(context: FragmentActivity){
    Toast.makeText(context, "hiii", Toast.LENGTH_SHORT).show()
}

fun Context.toastOrEgg(
    @Nullable text: CharSequence?,
    duration: Int,
    @Nullable backgroundTint: Int?, @Nullable textColor: Int?, @Nullable imageRes: Int?
){

    val inflate = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
    val v: View = inflate.inflate(R.layout.toast_egg, null)
    val lengthSHORT = 0
    val lengthLONG = 1
    v.txt_toast_title.text = text

    if (duration == lengthSHORT){
        Toast.LENGTH_SHORT
    } else if (duration == lengthLONG){
        Toast.LENGTH_LONG
    }

    if (textColor != null) {
        v.txt_toast_title.setTextColor(resources.getColor(textColor))
    }

    if (backgroundTint != null){
        v.background.colorFilter = PorterDuffColorFilter(ContextCompat.getColor(this, backgroundTint), PorterDuff.Mode.MULTIPLY)
    }

    if (imageRes != null) {
        v.iv_Res.setImageResource(imageRes)
    } else {
        v.iv_Res.visibility = View.GONE
    }

    val toastEgg = Toast(this)
    toastEgg.view = v
    toastEgg.show()

}