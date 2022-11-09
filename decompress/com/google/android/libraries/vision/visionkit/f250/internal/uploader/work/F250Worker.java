// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.vision.visionkit.f250.internal.uploader.work;

import java.util.Collection;
import androidx.work.WorkerParameters;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import androidx.work.RxWorker;

public final class F250Worker extends RxWorker
{
    public static final List g;
    public final lmy h;
    public final mwt i;
    public final mws j;
    public final nar k;
    public final mza l;
    public final naa m;
    public final int n;
    public final oxj o;
    
    static {
        g = new ArrayList();
    }
    
    public F250Worker(final lmy h, final mwt i, final mws j, final nar k, final mza l, final naa m, final int n, final oxj o, final Context context, final WorkerParameters workerParameters) {
        h.getClass();
        i.getClass();
        j.getClass();
        k.getClass();
        l.getClass();
        m.getClass();
        o.getClass();
        context.getClass();
        workerParameters.getClass();
        super(context, workerParameters);
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
    }
    
    public static final pim k() {
        return pjf.w(new ArrayList(), new ArrayList());
    }
    
    @Override
    public final void aG() {
        super.aG();
        this.l.a(myz.d(new myz(this.h, mvp.a, null)));
    }
    
    @Override
    public final oxk h() {
        final myz myz = new myz(this.h, mvs.a, null);
        this.l.a(myz.e(myz, null, null, 13, 11));
        F250Worker.g.clear();
        final mwt i = this.i;
        final owt c = mvc.d(mvc.d(mvc.d(mzc.b(i.a.b(pjf.t(new mvt[] { mvt.c, mvt.d, mvt.e }), mus.c), i.b, myz).h(new mzs(this, myz, 1)).a(new mzs(this, myz)), new mzq(this, myz, 1)), new mzq(this, myz)), new mzq(this, myz, 2)).c(new mzr(this, myz));
        final okj b = ooa.b(1L, 0);
        b.getClass();
        final oxj o = this.o;
        b.getClass();
        o.getClass();
        final pbn pbn = new pbn(c.f(), new mul(b, o));
        pip.l();
        return owt.d(pbn).h(cwx.f());
    }
    
    public final owt i(final myz myz) {
        return this.i.a(myz).h(new mzs(this, myz, 4)).a(new mzs(this, myz, 5));
    }
    
    public final owt j(final myz myz, final pim pim, final int n) {
        this.l.a(myz.e(myz, (Collection)pim.a, (Collection)pim.b, n, 8));
        return owt.a();
    }
}
