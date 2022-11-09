// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.auth.api.signin;

import android.content.Context;
import android.util.Log;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public final class RevocationBoundService extends Service
{
    public final IBinder onBind(final Intent intent) {
        if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) && !"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            final String value = String.valueOf(intent.getAction());
            String concat;
            if (value.length() != 0) {
                concat = "Unknown action sent to RevocationBoundService: ".concat(value);
            }
            else {
                concat = new String("Unknown action sent to RevocationBoundService: ");
            }
            Log.w("RevocationService", concat);
            return null;
        }
        return (IBinder)new jov((Context)this);
    }
}
