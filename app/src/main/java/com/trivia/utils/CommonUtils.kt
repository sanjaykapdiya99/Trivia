package com.trivia.utils

import android.app.Dialog
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.trivia.R
import com.trivia.interfaces.SendAnySingleValueInterface

object CommonUtils {

    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    fun showResultDialog(
        context: Context,
        message:String,
        sendAnySingleValueInterface: SendAnySingleValueInterface
    ) {
        val dialog = Dialog(context)
        dialog.setCancelable(false)
        dialog.setCanceledOnTouchOutside(false)
        dialog.setContentView(R.layout.answer_dialog)

        dialog.findViewById<TextView>(R.id.txtADDescription).setText(message)

        dialog.findViewById<MaterialButton>(R.id.mbtnADDone).setOnClickListener {
            sendAnySingleValueInterface.sendData("Done")
            dialog.dismiss()
        }

        dialog.show()
    }

    fun isOnline(context: Context): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        val capabilities =
            connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
        if (capabilities != null) {
            when {
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> {
                    return true
                }
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> {
                    return true
                }
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> {
                    return true
                }
            }
        }
        return false
    }

}