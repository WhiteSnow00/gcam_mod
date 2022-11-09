// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.vision.visionkit.f250.internal.uploader.work;

import java.util.Collection;
import androidx.work.WorkerParameters;
import android.content.Context;
import androidx.work.RxWorker;

public final class F250AutoWorker extends RxWorker
{
    public final mza g;
    public final mvy h;
    public final nae i;
    public final mwm j;
    public final myy k;
    private final lmy l;
    
    public F250AutoWorker(final lmy l, final mza g, final mvy h, final nae i, final mwm j, final myy k, final Context context, final WorkerParameters workerParameters) {
        l.getClass();
        g.getClass();
        h.getClass();
        i.getClass();
        j.getClass();
        k.getClass();
        context.getClass();
        workerParameters.getClass();
        super(context, workerParameters);
        this.l = l;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    @Override
    public final void aG() {
        super.aG();
        this.g.a(myz.d(new myz(this.l, mvo.a, null)));
    }
    
    @Override
    public final oxk h() {
        final myz myz = new myz(this.l, muv.a, null);
        this.g.a(myz.e(myz, null, null, 14, 11));
        final mvy h = this.h;
        final pbl pbl = new pbl(mvc.d(mvc.d(mzc.b(h.a.c(mzc.a(h.b), mvt.b, mus.c), h.c, myz).h(new mzf(this, myz, 3)).a(new mzf(this, myz, 4)), new mzd(this, myz, 1)), new mzd(this, myz)).c(new mze(this, myz)).f());
        pip.l();
        return owt.d(pbl).h(cwx.f());
    }
    
    public final owt i(final myz myz, final pim pim, final int n) {
        this.g.a(myz.e(myz, (Collection)pim.a, (Collection)pim.b, n, 8));
        return owt.a();
    }
}
