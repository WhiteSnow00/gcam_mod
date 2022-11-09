// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.wear.wearv2;

import android.app.NotificationManager;
import android.os.Parcelable;
import android.net.Uri;
import android.widget.Toast;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class InstallWearRequestReceiver extends BroadcastReceiver
{
    public final void onReceive(final Context context, final Intent intent) {
        if (!"com.google.android.apps.camera.wear.INSTALL_WEAR".equals(intent.getAction())) {
            throw new UnsupportedOperationException("unknown intent");
        }
        Toast.makeText(context, 2131952812, 0).show();
        final Intent addCategory = new Intent("android.intent.action.VIEW").setData(Uri.parse("market://details?id=com.google.android.GoogleCamera")).addCategory("android.intent.category.BROWSABLE");
        if (!"android.intent.action.VIEW".equals(addCategory.getAction())) {
            throw new IllegalArgumentException("Only android.intent.action.VIEW action is currently supported for starting a remote activity");
        }
        if (addCategory.getData() == null) {
            throw new IllegalArgumentException("Data Uri is required when starting a remote activity");
        }
        if (addCategory.getCategories() != null && addCategory.getCategories().contains("android.intent.category.BROWSABLE")) {
            context.sendBroadcast(new Intent("com.google.android.wearable.intent.action.REMOTE_INTENT").setPackage("com.google.android.wearable.app").putExtra("com.google.android.wearable.intent.extra.INTENT", (Parcelable)addCategory).putExtra("com.google.android.wearable.intent.extra.NODE_ID", (String)null).putExtra("com.google.android.wearable.intent.extra.RESULT_RECEIVER", (Parcelable)null));
            final int a = ga.a;
            ((NotificationManager)context.getSystemService("notification")).cancel((String)null, 1002);
            aec.a(context).d(new Intent("com.google.android.apps.camera.wear.INSTALL_WEAR_EVENT").setPackage(context.getPackageName()).putExtra("isPhone", intent.getBooleanExtra("isPhone", false)));
            return;
        }
        throw new IllegalArgumentException("The category android.intent.category.BROWSABLE must be present on the intent");
    }
}
