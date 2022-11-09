import android.os.Bundle;
import java.util.Map;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import android.content.DialogInterface$OnClickListener;
import java.util.concurrent.atomic.AtomicInteger;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bns implements bnl, exn, ewe, exk, ewf
{
    public final Activity a;
    public final bnv b;
    public final AtomicInteger c;
    public final DialogInterface$OnClickListener d;
    public final DialogInterface$OnClickListener e;
    public ofn f;
    public kc g;
    public final bmq h;
    private final bnm i;
    private final kjm j;
    private final Executor k;
    private final boolean l;
    private boolean m;
    private final bnk n;
    
    public bns(final Activity a, final bnv b, final ewy ewy, final bnm i, final bnk n, final bmq h, final kjm j, final Executor k, final boolean l) {
        this.c = new AtomicInteger();
        this.d = (DialogInterface$OnClickListener)new bnn(this, 1);
        this.e = (DialogInterface$OnClickListener)new bnn(this);
        this.m = false;
        this.g = null;
        this.a = a;
        this.b = b;
        this.i = i;
        this.n = n;
        this.h = h;
        this.j = j;
        this.k = k;
        this.l = l;
        egz.d(j, ewy, this);
    }
    
    private final void i(final int n, final boolean b) {
        this.j.execute(new bnr(this, n, b));
    }
    
    private final boolean j() {
        return this.l || this.i.d() || this.i.e();
    }
    
    @Override
    public final oey a() {
        final ofn f = this.f;
        if (f == null) {
            this.f = ofn.f();
            if (this.i.c() && this.j()) {
                this.f.o(true);
            }
            if (!this.f.isDone()) {
                this.e();
            }
        }
        else {
            f.isDone();
        }
        return this.f;
    }
    
    @Override
    public final boolean b() {
        return this.m;
    }
    
    @Override
    public final boolean c() {
        final bnm i = this.i;
        final String[] d = i.d;
        for (int j = 0; j < 2; ++j) {
            final String s = d[j];
            if (!i.b.containsKey(s)) {
                i.b.put(s, i.b(s));
            }
        }
        return i.d();
    }
    
    public final void d() {
        final kc g = this.g;
        if (g != null && g.isShowing()) {
            this.g.dismiss();
        }
    }
    
    public final void e() {
        njo.o(kjm.c() ^ true);
        this.m = false;
        this.d();
        final bnm i = this.i;
        final String[] c = i.c;
        for (int j = 0; j < 6; ++j) {
            final String s = c[j];
            if (!i.b.containsKey(s) || !(boolean)i.b.get(s)) {
                i.b.put(s, i.b(s));
            }
        }
        if (i.e() && !i.d()) {
            i.a();
        }
        if (this.i.c() && this.j()) {
            this.f.o(true);
            return;
        }
        this.m = true;
        if (this.l) {
            this.i(2131951950, true);
            return;
        }
        if (this.c.get() != 0) {
            this.c.get();
            return;
        }
        this.c.incrementAndGet();
        final bnm k = this.i;
        final bnk n = this.n;
        final ArrayList<String> list = new ArrayList<String>();
        final String[] c2 = k.c;
        for (int l = 0; l < 6; ++l) {
            final String s2 = c2[l];
            if (!k.b.containsKey(s2) || !(boolean)k.b.get(s2)) {
                list.add(s2);
            }
        }
        final String[] array = list.toArray(new String[0]);
        array.getClass();
        n.a.requestPermissions(array, 151398431);
    }
    
    @Override
    public final void f(int n, final String[] array, final int[] array2) {
        if (n != 151398431) {
            return;
        }
        this.c.decrementAndGet();
        if (array.length != 0 && array2.length != 0) {
            final bnm i = this.i;
            n = 0;
            while (true) {
                final int length = array.length;
                boolean b = true;
                if (n >= length) {
                    break;
                }
                if (!i.b.containsKey(array[n]) || !(boolean)i.b.get(array[n])) {
                    final Map b2 = i.b;
                    final String s = array[n];
                    if (array2[n] != 0) {
                        b = false;
                    }
                    b2.put(s, b);
                }
                ++n;
            }
            if (!i.e()) {
                i.a.d(hjq.P, true);
            }
            if (!i.d()) {
                i.a();
            }
            if (this.i.c()) {
                this.f.o(true);
                return;
            }
            this.i(2131951951, false);
        }
        else {
            if (kjm.c()) {
                this.c.get();
                this.k.execute(new bnq(this));
                return;
            }
            this.c.get();
        }
    }
    
    @Override
    public final void g(final Bundle bundle) {
        if (bundle.containsKey("PermissionsCheckerImpl.permissionsRequestCount")) {
            this.c.addAndGet(bundle.getInt("PermissionsCheckerImpl.permissionsRequestCount"));
        }
    }
    
    @Override
    public final void h(final Bundle bundle) {
        bundle.putInt("PermissionsCheckerImpl.permissionsRequestCount", this.c.get());
    }
}
