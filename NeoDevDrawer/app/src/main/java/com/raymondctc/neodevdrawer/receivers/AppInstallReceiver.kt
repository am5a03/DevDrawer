package com.raymondctc.neodevdrawer.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AppInstallReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val newPackage = intent?.data?.schemeSpecificPart


    }
}