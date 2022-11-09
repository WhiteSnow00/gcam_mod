// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api.internal;

import java.util.concurrent.TimeUnit;
import android.util.Log;
import java.lang.ref.WeakReference;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public abstract class BasePendingResult extends jqz
{
    public static final ThreadLocal c;
    private final CountDownLatch a;
    private final ArrayList b;
    public final Object d;
    public final jry e;
    public jrg f;
    public jrf g;
    public volatile boolean h;
    public boolean i;
    public volatile jrh j;
    private final AtomicReference k;
    private Status l;
    private boolean m;
    private jrz mResultGuardian;
    
    static {
        c = new jrx();
    }
    
    @Deprecated
    BasePendingResult() {
        this.d = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.k = new AtomicReference();
        this.i = false;
        this.e = new jry(Looper.getMainLooper());
        new WeakReference(null);
    }
    
    protected BasePendingResult(final jqw jqw) {
        this.d = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.k = new AtomicReference();
        this.i = false;
        Looper looper;
        if (jqw != null) {
            looper = ((jsr)jqw).a.h;
        }
        else {
            looper = Looper.getMainLooper();
        }
        this.e = new jry(looper);
        new WeakReference(jqw);
    }
    
    public static void i(final jrf jrf) {
        if (jrf instanceof jrc) {
            try {
                ((jrc)jrf).b();
            }
            catch (final RuntimeException ex) {
                final String value = String.valueOf(jrf);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 18);
                sb.append("Unable to release ");
                sb.append(value);
                Log.w("BasePendingResult", sb.toString(), (Throwable)ex);
            }
        }
    }
    
    protected abstract jrf a(final Status p0);
    
    public final jrf g() {
        Object d = this.d;
        synchronized (d) {
            jvu.g(this.h ^ true, "Result has already been consumed.");
            jvu.g(this.k(), "Result is not ready.");
            final jrf g = this.g;
            this.g = null;
            this.f = null;
            this.h = true;
            monitorexit(d);
            d = this.k.getAndSet(null);
            if (d != null) {
                ((jtw)d).a();
            }
            jvu.a(g);
            return g;
        }
    }
    
    @Deprecated
    public final void h(final Status status) {
        synchronized (this.d) {
            if (!this.k()) {
                this.j(this.a(status));
                this.m = true;
            }
        }
    }
    
    public final void j(final jrf g) {
        final Object d = this.d;
        monitorenter(d);
        try {
            if (!this.m) {
                this.k();
                jvu.g(this.k() ^ true, "Results have already been set");
                jvu.g(this.h ^ true, "Result has already been consumed");
                this.g = g;
                this.l = g.a();
                this.a.countDown();
                final jrg f = this.f;
                if (f == null) {
                    if (this.g instanceof jrc) {
                        this.mResultGuardian = new jrz(this);
                    }
                }
                else {
                    this.e.removeMessages(2);
                    this.e.a(f, this.g());
                }
                final ArrayList b = this.b;
                for (int size = b.size(), i = 0; i < size; ++i) {
                    ((jqy)b.get(i)).a(this.l);
                }
                this.b.clear();
                monitorexit(d);
                return;
            }
            i(g);
            monitorexit(d);
        }
        finally {
            monitorexit(d);
            while (true) {}
        }
    }
    
    public final boolean k() {
        return this.a.getCount() == 0L;
    }
    
    @Override
    public final void l(final jqy jqy) {
        jvu.c(jqy != null, "Callback cannot be null.");
        synchronized (this.d) {
            if (this.k()) {
                jqy.a(this.l);
            }
            else {
                this.b.add(jqy);
            }
        }
    }
    
    @Override
    public final jrf m(final TimeUnit timeUnit) {
        jvu.g(this.h ^ true, "Result has already been consumed.");
        jvu.g(true, "Cannot await if then() has been called.");
        try {
            if (!this.a.await(0L, timeUnit)) {
                this.h(Status.d);
            }
        }
        catch (final InterruptedException ex) {
            this.h(Status.b);
        }
        jvu.g(this.k(), "Result is not ready.");
        return this.g();
    }
}
