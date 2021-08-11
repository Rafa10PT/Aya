package com.example.aya

import android.util.Log

class AyaDebug {
    companion object {
        fun logError(str: String)  { Log.e("Aya:Log", str) }
        fun logInfo(str: String)   { Log.i("Aya:Log", str) }
    }
}
