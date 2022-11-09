// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver$PendingResult;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver
{
    public final void onReceive(final Context context, final Intent intent) {
        final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        final mny a = mny.a(context);
        if (a == null) {
            return;
        }
        final Map f = mqo.f(context);
        if (f.isEmpty()) {
            return;
        }
        final BroadcastReceiver$PendingResult goAsync = this.goAsync();
        final mpj mpj = f.get(stringExtra);
        oey oey;
        if (mpj == null) {
            oey = ofi.g(nns.n(mpl.b(a).b(new fli(stringExtra, 5), a.b()), a.b().a(new mpv(a, stringExtra)))).a(mpx.a, a.b());
        }
        else {
            oey = odg.i(oet.q(odg.h(oet.q(mpl.b(a).a()), new fli(stringExtra, 2), a.b())), new mps(mpj, stringExtra, a), a.b());
        }
        oey.d(new mpw(oey, stringExtra, goAsync), a.b());
    }
}
