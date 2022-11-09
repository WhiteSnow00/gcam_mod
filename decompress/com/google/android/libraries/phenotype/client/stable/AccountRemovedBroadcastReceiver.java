// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver$PendingResult;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver
{
    public final void onReceive(final Context context, final Intent intent) {
        if (!"android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction())) {
            return;
        }
        if (!mpl.a(intent.getStringExtra("accountType"))) {
            return;
        }
        final String string = intent.getExtras().getString("authAccount");
        final BroadcastReceiver$PendingResult goAsync = this.goAsync();
        final mny a = mny.a(context);
        if (a == null) {
            return;
        }
        ofi.h(mpl.b(a).b(new fli(string, 4), a.b()), a.b().a(new mos(context, string))).a(new mot(goAsync), odx.a);
    }
}
