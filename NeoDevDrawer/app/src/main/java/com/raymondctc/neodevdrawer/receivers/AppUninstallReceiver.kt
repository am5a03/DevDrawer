package com.raymondctc.neodevdrawer.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AppUninstallReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val packageName = intent?.data?.schemeSpecificPart
    }
}