// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.camerafatalerror;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class BootCompleteReceiver extends BroadcastReceiver
{
    public final void onReceive(final Context context, final Intent intent) {
        final StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append("_preferences");
        context.getSharedPreferences(sb.toString(), 0).edit().putBoolean("pref_key_reboot_completed", true).apply();
    }
}
