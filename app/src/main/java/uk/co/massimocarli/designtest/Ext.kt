package uk.co.massimocarli.designtest

import android.content.Context
import android.widget.Toast

fun Context.showToast(msg: String, long: Boolean = false) =
    Toast.makeText(
        this,
        msg,
        if (long) Toast.LENGTH_LONG else Toast.LENGTH_SHORT
    ).show()