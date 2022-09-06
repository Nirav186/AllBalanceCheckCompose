package com.example.allbalancecheckcompose.utils

import android.content.Context
import android.view.Gravity
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.drawerlayout.widget.DrawerLayout

fun DrawerLayout.openDrawer(isOpen: Boolean) {
    if (isOpen) {
        this.openDrawer(Gravity.LEFT)
    } else {
        this.closeDrawer(Gravity.LEFT)
    }
}

fun View.hide() {
    this.visibility = View.GONE
}

fun View.show() {
    this.visibility = View.VISIBLE
}

fun View.invisible() {
    this.visibility = View.INVISIBLE
}

fun View.hideKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(windowToken, 0)
}