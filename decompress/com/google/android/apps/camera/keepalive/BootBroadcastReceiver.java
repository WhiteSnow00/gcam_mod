// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.keepalive;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class BootBroadcastReceiver extends BroadcastReceiver
{
    public eho a;
    
    public final void onReceive(final Context context, final Intent intent) {
        ((ehk)((egp)context.getApplicationContext()).c(ehk.class)).h(this);
        if (!this.a.a()) {
            return;
        }
        ehp.b(context);
    }
}
