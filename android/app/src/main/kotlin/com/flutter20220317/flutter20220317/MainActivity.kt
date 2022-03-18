package com.flutter20220317.flutter20220317

import android.content.Intent
import io.flutter.embedding.android.FlutterActivity
import com.singular.flutter_sdk.SingularBridge;

class MainActivity: FlutterActivity() {
    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        SingularBridge.onNewIntent(intent)
    }
}
